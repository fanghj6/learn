package com.disign.responsibility;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO  责任链模式
 * @date 2019/9/18  22:08
 **/
public class Client {


    public static void main(String[] args) {

        LeaveApproval foreman = new ForemanApproval();
        LeaveApproval chairman = new ChairmanApproval();
        LeaveApproval manager = new ManagerApproval();
        foreman.setLeaveApproval(chairman);
        chairman.setLeaveApproval(manager);

        //请假
        foreman.leave(new Leave("002","万恶",new Double(15),"回家"));
        foreman.leave(new Leave("001","李氏",new Double(3.5),"有事"));
        foreman.leave(new Leave("004","九二",new Double(100),"睡觉"));
        foreman.leave(new Leave("003","客服",new Double(36.5),"旅游"));

    }
}
