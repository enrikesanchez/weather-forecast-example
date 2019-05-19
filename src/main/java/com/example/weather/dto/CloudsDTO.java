
package com.example.weather.dto;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CloudsDTO {
    @Expose
    private int all;
}
