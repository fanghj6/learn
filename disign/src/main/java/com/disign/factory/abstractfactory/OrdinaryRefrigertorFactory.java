package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName OrdinaryRefrigertorFactory
 * @Description TODO
 * @date 2019/8/21  17:14
 **/
public class OrdinaryRefrigertorFactory implements RefrigertorFactory{
    @Override
    public Freezing createFreezing() {
    return new OrdinaryFreezing();
    }

    @Override
    public Refrigeration createRefrigeration() {
        return new OrdinaryRefrigeration();
    }
}
