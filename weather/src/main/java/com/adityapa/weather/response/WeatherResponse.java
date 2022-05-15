package com.adityapa.weather.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponse {
    private Double temp;
    private Double feels_like;
    private Double temp_min;
    private Double temp_max;
    private String country;
    private String city;
}
