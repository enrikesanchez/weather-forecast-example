
package com.example.weather.json;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Coord {
    @Expose
    private double lat;
    
    @Expose
    private double lon;

}
