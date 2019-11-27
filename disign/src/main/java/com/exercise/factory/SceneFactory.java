package com.exercise.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SceneFactory
 * @Description TODO
 * @date 2019/11/25  9:12
 **/
public interface SceneFactory {

    /**
     *创建地图  map
     */
    Map createMap();
    /**
     * 创建音乐 music
     */
    Music createMusic();
    /**
     * 创建天气 weather
     */
    Weather createWeather();
}
