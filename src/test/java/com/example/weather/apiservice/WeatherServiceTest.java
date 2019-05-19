package com.example.weather.apiservice;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.weather.apiservice.TemperatureUnit;
import com.example.weather.apiservice.WeatherService;
import com.example.weather.vo.WeatherVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceTest {
	@Autowired
	WeatherService weatherService; 
	
	@Test
	public void shouldReturnWeatherDTOWhenCityUnitDaysProvided() {
		List<WeatherVO> weatherList = weatherService.getForecast(4014338, TemperatureUnit.CELSIUS, 1);
		assertEquals(1 * 8, weatherList.size()); // 8 lines per day
	}
}
