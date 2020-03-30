package com.version2.behavior.resolve.version2;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2020/3/22  20:01
 **/
public class Context {

    private StringTokenizer stringTokenizer;

    private String value;

    public Context(String command) {
        this.stringTokenizer = new StringTokenizer(command);
    }

    public String currentToken(){
        return this.value;
    }
    public String nextToken(){
        try {
            this.value = stringTokenizer.nextToken();
        } catch (Exception e) {
            System.out.println( "get token is null");
            this.value = null;
        }
        return this.value;
    }
}
