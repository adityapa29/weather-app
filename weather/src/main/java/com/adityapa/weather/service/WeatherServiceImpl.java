package com.adityapa.weather.service;

import com.adityapa.weather.entity.Weather;
import com.adityapa.weather.mapper.WeatherMapper;
import com.adityapa.weather.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.uri}")
    private String uri;

    @Autowired
    private WeatherMapper mapper;

    @Override
    public WeatherResponse getCurrentWeatherDetails(String latitude, String longitude) {
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(uri + "&lat=" + latitude + "&lon=" + longitude, Weather.class);
        WeatherResponse response = mapper.mapWeatherToWeatherResponse(weather);
        return response;
    }
}
