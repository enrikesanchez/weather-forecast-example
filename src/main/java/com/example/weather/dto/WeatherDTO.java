
package com.example.weather.dto;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class WeatherDTO {
    @Expose
    private int id;

    @Expose
    private String main;

    @Expose
    private String description;

    @Expose
    private String icon;

}
