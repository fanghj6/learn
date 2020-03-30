package com.version2.create.factory.AbsFactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName MDProductFactory
 * @Description TODO
 * @date 2020/3/17  17:51
 **/
public class MDProductFactory implements ProductFactory {
    @Override
    public Television createTelevision() {
        return new MDTelevision();
    }

    @Override
    public RefRigerator createRefrigerator() {
        return new MDRefrigerator();
    }
}
