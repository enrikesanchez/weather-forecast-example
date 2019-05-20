
package com.example.weather.json;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Forecast {
	private String cod;
	private double message;
	private int cnt;
	private java.util.List<com.example.weather.json.List> list = null;
	private City city;

}
