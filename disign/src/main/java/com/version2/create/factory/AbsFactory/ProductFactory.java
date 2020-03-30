package com.version2.create.factory.AbsFactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductFactory
 * @Description TODO
 * @date 2020/3/17  17:48
 **/
public interface ProductFactory {

    /**
     * 生产电视
     * @return
     */
    Television createTelevision();

    /**
     * 生产冰箱
     * @return
     */
    RefRigerator createRefrigerator();

}
