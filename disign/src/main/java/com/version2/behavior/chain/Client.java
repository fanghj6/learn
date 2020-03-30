package com.version2.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/20  20:21
 **/
public class Client {

    public static void main(String[] args) {
        //职责链模式
        //角色：抽象处理者，具体处理者
        //类型：纯职责链模式：一条链必须有一个唯一的处理类，不纯职责链模式：可以有多个或者没有处理者处理

        //纯职责模式
        Hander leaderHander = new LeaderHander();
        Hander chairManHander = new ChairManHander();
        leaderHander.setHander(chairManHander);

        Leave leave = new Leave();
        leave.setName("admin");
        leave.setDay(7);
        leaderHander.handerLeave(leave);

        leave.setName("admin");
        leave.setDay(30);
        leaderHander.handerLeave(leave);

    }
}
