package com.adityapa.weather.mapper;

import com.adityapa.weather.entity.Weather;
import com.adityapa.weather.response.WeatherResponse;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper {

    public WeatherResponse mapWeatherToWeatherResponse(Weather weather) {
        WeatherResponse response = new WeatherResponse();
        response.setTemp(weather.getTempDetails().getTemp());
        response.setFeels_like(weather.getTempDetails().getFeels_like());
        response.setTemp_max(weather.getTempDetails().getTemp_max());
        response.setTemp_min(weather.getTempDetails().getTemp_min());
        response.setCountry(weather.getCountryObject().getCountry());
        response.setCity(weather.getCity());
        return response;
    }
}
