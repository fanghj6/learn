package com.disign.test.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FankeTest
 * @Description TODO
 * @date 2019/8/22  10:49
 **/
public class FankeTest {
    static class haha implements Runnable{

        public haha(List<String> list) {
            // TODO Auto-generated constructor stub
            this.list = (ArrayList<String>)list;
        }

        @Override
        public synchronized void run() {
            while(log != null){
                if(list.size()>0) {
                    try {
                        Thread.currentThread().sleep(1);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    log = list.remove(0); //报下标错误
                    System.out.println(++i);
                    System.out.println(log);
                }else {break;}

            }

        }

        private List<String> list;
        private String log = "";
        private  static int i = 0;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"aa", "bb", "cc"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strs));
        Thread t1 = new Thread(new haha(list));
        Thread t2 = new Thread(new haha(list));
        System.out.println(haha.i);
        t1.start();
        t2.start();
        System.out.println(haha.i);
    }

}
