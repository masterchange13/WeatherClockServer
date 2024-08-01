package com.mao.weatherclockserver.controller;

import com.mao.weatherclockserver.dao.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/weather")
    public Weather getWeather() {
        Weather weather = new Weather();
        // 获取天气
        weather.setLocation("常州");
        weather.setTemperature("20");
        weather.setWeather("阴");
        weather.setWind("西北风3级");

        return weather;
    }
}
