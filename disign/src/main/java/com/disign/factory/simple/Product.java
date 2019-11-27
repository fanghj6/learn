package com.disign.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName 产品类
 * @Description TODO
 * @date 2019/8/20  14:16
 **/
public abstract class Product {

    /**
     * 显示产品
     */
  public  void show(){
      System.out.println(this.toString());
  }

    /**
     * 购买产品
     */
    public abstract  void buyProduct();
}
