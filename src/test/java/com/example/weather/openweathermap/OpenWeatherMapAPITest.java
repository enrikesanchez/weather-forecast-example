package com.example.weather.openweathermap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.weather.dto.ForecastDTO;
import com.google.gson.Gson;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenWeatherMapAPITest {

	@Test
	public void shouldReturnForecastWhenCityUnitsAndCountProvided() {
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		ResponseEntity<String> response = testRestTemplate.
		  getForEntity("http://api.openweathermap.org/data/2.5/forecast?id=4014338&units=metric&cnt=8&APPID=7a147d89f0a5ffb402d041e6623e2778", String.class);
		  
		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertTrue(response.getBody().contains("list"));
	}
	
	@Test
	public void shouldCreateForecastDTOWhenCityUnitsAndCountProvided() {
		Gson gson = new Gson();
		
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		ResponseEntity<String> response = testRestTemplate.
		  getForEntity("http://api.openweathermap.org/data/2.5/forecast?id=4014338&units=metric&cnt=8&APPID=7a147d89f0a5ffb402d041e6623e2778", String.class);
		  
		ForecastDTO forecast = gson.fromJson(response.getBody(), ForecastDTO.class);
		
		assertNotNull(forecast);
	}	
}