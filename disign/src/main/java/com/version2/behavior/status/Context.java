package com.version2.behavior.status;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020/3/24  19:33
 **/
public class Context {

    private State state;

    public Context(Account account) {
        this.state = new NormalState(account);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //取款
    public void take(double money){
        this.state.take(money);
        this.state.checkState(this);
        this.state.showState();
    }
    //存款
    public void save(double money){
        this.state.save(money);
        this.state.checkState(this);
        this.state.showState();
    }
    //计算利息
    public void interest(){
        this.state.interest();
        this.state.showState();
    }
}
