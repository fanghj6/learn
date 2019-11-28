package com.exercise.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  建造者模式
 * @date 2019/11/28  9:34
 **/
public class Client {

    public static void main(String[] args) {
        PlayerCreatorDirector playerCreatorDirector = new PlayerCreatorDirector();
        playerCreatorDirector.setPlayerBuilder(new PlayerBuilderA());
        Player player = playerCreatorDirector.construct();
        System.out.println(player);
    }
}
