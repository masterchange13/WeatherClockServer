package com.mao.weatherclockserver;

import com.mao.weatherclockserver.dao.TimeData;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void testTime() {
        TimeData time = new TimeData();
        System.out.println(time);
    }
}
