package com.example.weather.service;

import com.example.weather.json.Forecast;

public interface WeatherService {
	public Forecast getForecast(int cityId, TemperatureUnit unit, int days);
}
