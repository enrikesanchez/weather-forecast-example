package com.example.weather.service;

public enum TemperatureUnit {
	FAHRENHEIT("imperial"),
    CELSIUS("metric");
 
    private String code;
 
    TemperatureUnit(String code) {
        this.code = code;
    }
 
    public String getCode() {
        return code;
    }
}
