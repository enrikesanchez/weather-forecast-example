
package com.example.weather.dto;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CoordDTO {
    @Expose
    private double lat;
    
    @Expose
    private double lon;

}
