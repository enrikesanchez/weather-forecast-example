
package com.example.weather.json;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Main {
	private double temp;
	private double tempMin;
	private double tempMax;
	private double pressure;
	private double seaLevel;
	private double grndLevel;
	private int humidity;
	private double tempKf;
}
