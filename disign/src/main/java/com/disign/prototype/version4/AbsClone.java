package com.disign.prototype.version4;

import java.io.Serializable;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbsClone
 * @Description TODO
 * @date 2019/8/27  10:00
 **/
public abstract class AbsClone implements Serializable,Cloneable {

    public abstract AbsClone clone();
}
