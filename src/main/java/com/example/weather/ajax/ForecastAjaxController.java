package com.example.weather.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.weather.apiservice.TemperatureUnit;
import com.example.weather.apiservice.WeatherService;
import com.example.weather.vo.WeatherVO;

@RestController
public class ForecastAjaxController {
	@Autowired
	WeatherService service;

	@GetMapping(path = "/forecast/{cityId}/{temperatureUnit}/{daysToDisplay}", produces = "application/json")
	public List<WeatherVO> getForecast(@PathVariable(value = "cityId", required = true) final int cityId,
			@PathVariable(value = "temperatureUnit", required = true) final String temperatureUnit,
			@PathVariable(value = "daysToDisplay", required = true) final int daysToDisplay) {

		TemperatureUnit unit = TemperatureUnit.valueOf(temperatureUnit);

		return service.getForecast(cityId, unit, daysToDisplay);
	}
}
