package com.exercise.builder;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PlayerBuilderA
 * @Description TODO   具体构造者
 * @date 2019/11/28  9:18
 **/
public class PlayerBuilderA  extends PlayerBuilder{

    public PlayerBuilderA() {
        this.player= new Player();
    }

    @Override
    public void builderBody() {
        this.player.setBody("很瘦");
    }

    @Override
    public void builderCustume() {
        this.player.setCustume("衬衫");
    }

    @Override
    public void builderWeapon() {
     this.player.setWeapon("刀");
    }
}
