
package com.example.weather.json;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class List {
    @Expose
    private int dt;

    @Expose
    private Main main;

    @Expose
    private java.util.List<Weather> weather = null;

    @Expose
    private Clouds clouds;

    @Expose
    private Wind wind;

    @Expose
    private Sys sys;

    @Expose
    private String dtTxt;
}
