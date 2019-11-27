package com.disign.factory.factory.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Factory
 * @Description TODO
 * @date 2019/8/21  9:41
 **/
public abstract class Factory{

    /**
     * 创建日志类
     * @return
     */
   public abstract Log createLog();

    /**
     * 写日志
     * @param str
     */
   public void writeLog(String str){
       this.createLog().writeLog(str);
   }
}
