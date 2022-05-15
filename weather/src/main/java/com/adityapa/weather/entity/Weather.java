package com.adityapa.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    @JsonProperty("main")
    private TempDetails tempDetails;
    @JsonProperty("sys")
    private CountryObject countryObject;
    @JsonProperty("name")
    private String city;

}
