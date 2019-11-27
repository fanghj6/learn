package com.disign.obServer.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Observer
 * @Description TODO
 * @date 2019/11/18  15:54
 **/
public interface Observer {



    /**
     * 帮助
     */
     void help();

    /**
     * 获取名称
     * @return
     */
     String getName();

    /**
     * 设置名称
     * @param name
     */
     void setName(String name);

}
