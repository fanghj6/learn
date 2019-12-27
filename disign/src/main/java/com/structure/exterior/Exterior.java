package com.structure.exterior;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Exterior
 * @Description TODO
 * @date 2019/12/23  13:53
 **/
public class Exterior {

    private  Appliance appliance;

    private  BrewTea brewTea;

    public Exterior(Appliance appliance, BrewTea brewTea) {
        this.appliance = appliance;
        this.brewTea = brewTea;
    }

    public void operator(){
        appliance.operator();
        brewTea.operator();
        System.out.println("喝茶");
    }

}
