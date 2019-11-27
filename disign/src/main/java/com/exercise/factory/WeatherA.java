package com.exercise.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName WeatherA
 * @Description TODO
 * @date 2019/11/25  9:55
 **/
public class WeatherA implements Weather {
    @Override
    public void weather() {
        System.out.println("weather   A");
    }
}
