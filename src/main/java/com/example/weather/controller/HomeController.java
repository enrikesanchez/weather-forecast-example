package com.example.weather.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PropertySource("classpath:config.properties")
public class HomeController {
	@Value("#{${home.cities.map}}")
	private Map<String, String> citiesMap;	
	
	@Value("${home.default.cityId}")
	private String defaultCityId;
	
	@Value("${home.default.temperatureUnit}")
	private String defaultTemperatureUnit;

	@Value("${home.default.daysToDisplay}")
	private String defaultDaysToDisplay;
	
	@RequestMapping("/")
    public String showHome(Model model) {
        model.addAttribute("defaultCityId", defaultCityId);
        model.addAttribute("detaulTemperatureUnit", defaultTemperatureUnit);
        model.addAttribute("defaultDaysToDisplay", defaultDaysToDisplay);
        model.addAttribute("citiesMap", citiesMap);

        return "home";
    }
}
