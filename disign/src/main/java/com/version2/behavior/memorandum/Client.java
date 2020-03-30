package com.version2.behavior.memorandum;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/24  10:00
 **/
public class Client {

    public static void main(String[] args) {
        //备忘录模式
        //角色：原发器，备忘录，负责人

        Principal principal = new Principal();
        Primer primer = new Primer();
        primer.setState("1");
        System.out.println("state = "+primer.getState());
        Memo memo = primer.createMemo();
        principal.setMemo(memo);
        primer.setState("2");
        System.out.println("state = "+primer.getState());
        primer.revoke(principal.getMemo());
        System.out.println("state = "+primer.getState());

    }
}
