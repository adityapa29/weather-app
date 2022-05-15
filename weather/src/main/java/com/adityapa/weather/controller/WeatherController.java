package com.adityapa.weather.controller;

import com.adityapa.weather.entity.ErrorDetails;
import com.adityapa.weather.response.WeatherResponse;
import com.adityapa.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/weather")
@Validated
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping
    public ResponseEntity<?> getCurrentWeather(@NotBlank @RequestParam String latitude,
                                               @NotBlank @RequestParam String longitude) {
        try {
            WeatherResponse response = service.getCurrentWeatherDetails(latitude, longitude);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new ErrorDetails(ex.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

}
