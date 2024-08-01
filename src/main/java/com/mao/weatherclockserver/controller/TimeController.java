package com.mao.weatherclockserver.controller;

import com.mao.weatherclockserver.dao.TimeData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {
    @GetMapping("time")
    public TimeData getTime(){
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 创建TimeData对象并填充数据
        TimeData timeData = new TimeData();
        timeData.setHours(now.getHour());
        timeData.setMinutes(now.getMinute());
        timeData.setSeconds(now.getSecond());
        timeData.setMonth(now.getMonthValue());
        timeData.setDay(now.getDayOfMonth());

        // 打印TimeData对象
        System.out.println(timeData);
        return timeData;
    }
}
