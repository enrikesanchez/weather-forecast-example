
package com.example.weather.json;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Weather {
    @Expose
    private int id;

    @Expose
    private String main;

    @Expose
    private String description;

    @Expose
    private String icon;

}
