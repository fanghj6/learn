package com.exercise.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SceneFactoryB
 * @Description TODO
 * @date 2019/11/25  10:06
 **/
public class SceneFactoryB implements SceneFactory {
    @Override
    public Map createMap() {
        return new MapB();
    }

    @Override
    public Music createMusic() {
        return new MusicB();
    }

    @Override
    public Weather createWeather() {
        return new WeatherB();
    }
}
