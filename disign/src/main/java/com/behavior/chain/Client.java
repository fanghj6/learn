package com.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  责任链模式，角色：抽象处理者，具体处理者
 * 纯：处理者只能有两个行为，处理完任务或抛给下一个，整条链必须有一个处理者会处理
 * 不纯：处理者可以处理部分或全部，处理完还可以抛给下一个继续处理，整条链走完可以没有处理
 * @date 2019/12/26  10:03
 **/
public class Client {

    public static void main(String[] args) {
        AbsProcess manager = new ManagerProcess();
        AbsProcess director = new DirectorProcess();
        AbsProcess viceChairman = new ViceChairmanProcess();
        viceChairman.setAbsProcess(director);
        manager.setAbsProcess(viceChairman);

        manager.operator("lishi",10);
        manager.operator("lishi",20);
        manager.operator("lishi",60);
    }
}
