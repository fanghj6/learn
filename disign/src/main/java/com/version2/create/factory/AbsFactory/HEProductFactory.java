package com.version2.create.factory.AbsFactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName HEProductFactory
 * @Description TODO
 * @date 2020/3/17  17:50
 **/
public class HEProductFactory implements ProductFactory {
    @Override
    public Television createTelevision() {
        return new HETelevision();
    }

    @Override
    public RefRigerator createRefrigerator() {
        return new HERefRigerator();
    }
}
