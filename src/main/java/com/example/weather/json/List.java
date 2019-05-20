
package com.example.weather.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class List {
	private int dt;
	private Main main;
	private java.util.List<Weather> weather = null;
	private Clouds clouds;
	private Wind wind;
	private Sys sys;
    @JsonProperty("dt_txt")
    private String dtTxt;
}
