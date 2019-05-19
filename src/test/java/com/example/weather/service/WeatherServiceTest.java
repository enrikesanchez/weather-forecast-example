package com.example.weather.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.weather.json.Forecast;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceTest {
	@Autowired
	WeatherService weatherService; 
	
	@Test
	public void shouldReturnWeatherDTOWhenCityUnitDaysProvided() {
		Forecast forecast = weatherService.getForecast(4014338, TemperatureUnit.CELSIUS, 1);
		assertEquals("Chihuahua", forecast.getCity().getName());
		assertEquals(1 * 8, forecast.getList().size()); // 8 lines per day
	}
}
