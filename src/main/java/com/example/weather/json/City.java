
package com.example.weather.json;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class City {
	private int id;
	private String name;
	private Coord coord;
	private String country;
}
