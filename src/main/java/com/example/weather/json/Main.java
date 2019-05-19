
package com.example.weather.json;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Main {
    @Expose
    private double temp;

    @Expose
    private double tempMin;

    @Expose
    private double tempMax;

    @Expose
    private double pressure;

    @Expose
    private double seaLevel;

    @Expose
    private double grndLevel;

    @Expose
    private int humidity;

    @Expose
    private double tempKf;
}
