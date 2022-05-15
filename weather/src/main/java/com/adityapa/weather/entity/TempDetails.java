package com.adityapa.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempDetails {
    private Double temp;
    private Double feels_like;
    private Double temp_min;
    private Double temp_max;
}
