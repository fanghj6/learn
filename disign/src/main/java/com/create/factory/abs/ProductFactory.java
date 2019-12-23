package com.create.factory.abs;


/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductFactory
 * @Description TODO
 * @date 2019/12/20  14:47
 **/
public interface ProductFactory {


     Product getVipProduct();

     Product getOrdinaryProduct();
}
