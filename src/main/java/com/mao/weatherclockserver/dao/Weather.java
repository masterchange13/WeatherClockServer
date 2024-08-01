package com.mao.weatherclockserver.dao;

import lombok.Data;

@Data
public class Weather {
    private String location;
    private String weather;
    private String temperature;
    private String wind;
}
