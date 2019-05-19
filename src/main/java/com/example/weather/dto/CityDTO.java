
package com.example.weather.dto;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CityDTO {
	@Expose
	private int id;

	@Expose
	private String name;
	
	@Expose
	private CoordDTO coord;
	
	@Expose
	private String country;
}
