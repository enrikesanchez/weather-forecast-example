
package com.example.weather.json;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class City {
	@Expose
	private int id;

	@Expose
	private String name;
	
	@Expose
	private Coord coord;
	
	@Expose
	private String country;
}
