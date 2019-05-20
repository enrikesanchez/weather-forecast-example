
package com.example.weather.json;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Weather {
	private int id;
	private String main;
	private String description;
	private String icon;
}
