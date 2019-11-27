package com.disign.command.version2;

import java.io.*;
import java.net.URL;

/**
 * @author fhj
 * @version 1.0
 * @ClassName AbstractCommand
 * @Description TODO
 * @date 2019/9/22  15:50
 **/
public abstract class AbstractCommand {

    /**
     * 累加
     * @param args
     * @return
     */
   public abstract   int execute(int args);

    /**
     * 撤销
     */
    public abstract   int undo();

    /**
     *  断电恢复状态
     */
    public abstract   void restore() throws Exception;


    /**
     * 保存状态
     * @param obj
     */
    public void saveStatus(Object obj) throws Exception {
        URL url = this.getClass().getClassLoader().getResource("data/command.log");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(url.getPath()));
        objectOutputStream.writeObject(obj);
    }


    /**
     * 读取状态
     */
    public Object readStatus() throws Exception {

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("data/command.log");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return objectInputStream.readObject();
    }
}
