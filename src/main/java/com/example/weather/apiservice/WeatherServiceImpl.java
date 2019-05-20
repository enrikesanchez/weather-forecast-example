package com.example.weather.apiservice;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.weather.json.Forecast;
import com.example.weather.vo.WeatherVO;

@Service
@PropertySource("classpath:config.properties")
public class WeatherServiceImpl implements WeatherService {
	private static final int LINES_PER_DAY = 8; 

	private static final String PARAM_API_KEY_ID = "APPID";

	private static final String PARAM_NUMBER_OF_LINES = "cnt"; // each line is a 3 hours period

	private static final String PARAM_UNITS = "units";

	private static final String PARAM_ID = "id";

	@Value("${openweathermap.forecast.url}")
	private String forecastUrl;
	
	@Value("${openweathermap.appId}")
	private String appId;	
	
	@Value("${images.url.base}")
	private String imagesBaseUrl;	

	@Value("${images.url.extension}")
	private String imagesExtension;	

	@Value("${forecast.dateformat.input}")
	private String inputDateFormat;	
	
	@Value("${forecast.dateformat.output}")
	private String outputDateFormat;	
	
	@Value("${forecast.temp.numberformat.output}")
	private String temperatureNumberFormat;	
	
	@Override
	public List<WeatherVO> getForecast(final int cityId, final TemperatureUnit unit, final int days) {
		RestTemplate restTemplate = new RestTemplate();
		List<WeatherVO> weatherList = new ArrayList<WeatherVO>();
		DateFormat outputDf = new SimpleDateFormat(outputDateFormat);
		DateFormat inputDf = new SimpleDateFormat(inputDateFormat);
		NumberFormat nf = new DecimalFormat(temperatureNumberFormat);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Forecast> entity = new HttpEntity<Forecast>(headers);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(forecastUrl)
		        .queryParam(PARAM_ID, cityId)
		        .queryParam(PARAM_UNITS, unit.getCode())
		        .queryParam(PARAM_NUMBER_OF_LINES, days * LINES_PER_DAY)
		        .queryParam(PARAM_API_KEY_ID, appId);		

		HttpEntity<Forecast> response = restTemplate.exchange(
		        builder.toUriString(), 
		        HttpMethod.GET, 
		        entity, 
		        Forecast.class);
		
		if (null != response) {
			for (com.example.weather.json.List list : response.getBody().getList()) {
				try {
					WeatherVO weather = new WeatherVO();
					weather.setTimestamp(outputDf.format(inputDf.parse(list.getDtTxt())));
					weather.setTemperature(nf.format(list.getMain().getTemp()));
					weather.setDescription(list.getWeather().get(0).getDescription());
					String imageUrl = imagesBaseUrl + list.getWeather().get(0).getIcon() + imagesExtension; 
					weather.setImageUrl(imageUrl);
					weatherList.add(weather);
				} catch (final ParseException pe) {
					// TODO: Add a log message
				}
			}
		}
		
		return weatherList;
	}

}
