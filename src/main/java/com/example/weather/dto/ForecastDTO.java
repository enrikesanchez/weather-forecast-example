
package com.example.weather.dto;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ForecastDTO {
    @Expose
    private String cod;

    @Expose
    private double message;

    @Expose
    private int cnt;

    @Expose
    private java.util.List<com.example.weather.dto.ListDTO> list = null;

    @Expose
    private CityDTO city;

}
