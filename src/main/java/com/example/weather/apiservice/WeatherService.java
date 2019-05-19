package com.example.weather.apiservice;

import java.util.List;

import com.example.weather.vo.WeatherVO;

public interface WeatherService {
	public List<WeatherVO> getForecast(int cityId, TemperatureUnit unit, int days);
}
