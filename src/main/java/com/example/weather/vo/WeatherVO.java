package com.example.weather.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class WeatherVO {
	private long timestamp;
	private double temperature;
	private String description;
	private String imageUrl;
}
