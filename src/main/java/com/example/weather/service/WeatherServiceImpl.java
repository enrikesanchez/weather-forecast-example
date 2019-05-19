package com.example.weather.service;

import java.util.Arrays;

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
	
	@Override
	public Forecast getForecast(final int cityId, final TemperatureUnit unit, final int days) {
		RestTemplate restTemplate = new RestTemplate();
		
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
		
		return response.getBody();
	}

}
