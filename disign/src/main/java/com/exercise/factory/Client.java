package com.exercise.factory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client  抽象工厂模式
 * @Description TODO
 * @date 2019/11/25  10:10
 **/
public class Client {

    public static void main(String[] args) {

        //创建场景A
        SceneFactory sceneFactoryA = new SceneFactoryA();
        sceneFactoryA.createMap().showMap();
        sceneFactoryA.createMusic().ShowMusic();
        sceneFactoryA.createWeather().weather();
        //创建场景B
        SceneFactory sceneFactoryB = new SceneFactoryB();
        sceneFactoryB.createMap().showMap();
        sceneFactoryB.createMusic().ShowMusic();
        sceneFactoryB.createWeather().weather();
    }
}
