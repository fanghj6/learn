package com.behavior.chain;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbsProcess
 * @Description TODO
 * @date 2019/12/26  9:58
 **/
public abstract class AbsProcess {

    protected AbsProcess absProcess;

    public void setAbsProcess(AbsProcess absProcess) {
        this.absProcess = absProcess;
    }

    abstract void operator(String name, int num);
}
