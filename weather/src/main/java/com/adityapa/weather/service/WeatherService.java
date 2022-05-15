package com.adityapa.weather.service;

import com.adityapa.weather.response.WeatherResponse;

public interface WeatherService {
    WeatherResponse getCurrentWeatherDetails(String latitude, String longitude);
}
