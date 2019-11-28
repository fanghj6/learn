package com.exercise.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PlayerCreatorDirector
 * @Description TODO 指挥者
 * @date 2019/11/28  9:16
 **/
public class PlayerCreatorDirector {

    private PlayerBuilder playerBuilder;

    public void setPlayerBuilder(PlayerBuilder playerBuilder) {
        this.playerBuilder = playerBuilder;
    }

    public Player construct(){
        playerBuilder.builderBody();
        playerBuilder.builderCustume();
        playerBuilder.builderWeapon();
        return playerBuilder.getPlayer();
    }
}
