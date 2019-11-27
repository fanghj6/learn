package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName VipRefrigertorFactory
 * @Description TODO
 * @date 2019/8/21  17:14
 **/
public class VipRefrigertorFactory implements RefrigertorFactory{
    @Override
    public Freezing createFreezing() {
        return new VipFreezing();
    }

    @Override
    public Refrigeration createRefrigeration() {
        return new VipRefrigeration();
    }
}
