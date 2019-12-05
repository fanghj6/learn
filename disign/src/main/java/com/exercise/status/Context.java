package com.exercise.status;

import lombok.Data;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AcountContext
 * @Description TODO
 * @date 2019/12/5  14:07
 **/
@Data
public abstract class Context {

    private Account account;

    private Status status;

    public abstract void save(Double amt);

    public abstract void take(Double amt);

}
