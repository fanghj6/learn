package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RefrigertorFactory
 * @Description TODO
 * @date 2019/8/21  17:07
 **/
public interface RefrigertorFactory {

    /**
     * 创建冷冻功能
     */
    Freezing createFreezing();



    /**
     * 创建冷藏功能
     */
    Refrigeration createRefrigeration();
}
