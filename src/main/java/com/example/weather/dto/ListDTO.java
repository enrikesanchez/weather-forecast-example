
package com.example.weather.dto;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ListDTO {
    @Expose
    private int dt;

    @Expose
    private MainDTO main;

    @Expose
    private java.util.List<WeatherDTO> weather = null;

    @Expose
    private CloudsDTO clouds;

    @Expose
    private WindDTO wind;

    @Expose
    private SysDTO sys;

    @Expose
    private String dtTxt;
}
