
package com.example.weather.json;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Forecast {
    @Expose
    private String cod;

    @Expose
    private double message;

    @Expose
    private int cnt;

    @Expose
    private java.util.List<com.example.weather.json.List> list = null;

    @Expose
    private City city;

}
