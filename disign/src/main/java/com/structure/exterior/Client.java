package com.structure.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO 外观模式：角色：外观角色，子系统角色
 * @date 2019/12/23  13:48
 **/
public class Client {

    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        BrewTea brewTea = new BrewTea();
        Exterior exterior = new Exterior(appliance,brewTea);
        exterior.operator();
    }
}
