package com.behavior.interpreter;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2019/12/26  15:09
 **/
public class Context {

    private String current;

    public StringTokenizer stringTokenizer;

    public Context(String str) {
        this.stringTokenizer  = new StringTokenizer(str);
    }

    //判断是否有下一个
    public boolean HasNext(){
        boolean result = this.stringTokenizer.hasMoreTokens();
        return result;
    }

    //获取下一个
    public String nextValue(){
        this.current = "";
        if(HasNext()){
            this.current = this.stringTokenizer.nextToken();
        }
        return this.current;
    }

    public String getCurrent() {
        return current;
    }
}
