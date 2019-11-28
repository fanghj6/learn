package com.exercise.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PlayerBuilder
 * @Description TODO  播放器抽象构建者
 * @date 2019/11/28  9:17
 **/
public abstract class PlayerBuilder {

    protected   Player player;

    /**
     * 构建体型
     */
    public abstract void builderBody();

    /**
     * 构建服装
     */
    public abstract void builderCustume();

    /**
     * 构建武器
     */
    public abstract void builderWeapon();

    public Player getPlayer() {
        return player;
    }
}
