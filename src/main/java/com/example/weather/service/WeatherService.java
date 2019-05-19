package com.example.weather.service;

import com.example.weather.dto.ForecastDTO;

public interface WeatherService {
	public ForecastDTO getForecast(int cityId, TemperatureUnit unit, int days);
}
