package com.exercise.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SceneFactoryA
 * @Description TODO
 * @date 2019/11/25  10:06
 **/
public class SceneFactoryA implements SceneFactory {
    @Override
    public Map createMap() {
        return new MapA();
    }

    @Override
    public Music createMusic() {
        return new MusicA();
    }

    @Override
    public Weather createWeather() {
        return new WeatherA();
    }
}
