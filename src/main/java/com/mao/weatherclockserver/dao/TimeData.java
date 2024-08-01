package com.mao.weatherclockserver.dao;

import lombok.Data;

@Data
public class TimeData {
    private int hours;
    private int minutes;
    private int seconds;
    private int month;
    private int day;
}
