package com.disign.interpreter.version2;

import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Context
 * @Description TODO
 * @date 2019/9/24  20:37
 **/
public class Context {


    /**
     * StringTokenizer类，用于将字符串分解为更小的字符串标记(Token)，默认情况下以空格作为分隔符
     */
    private StringTokenizer tokenizer;

    /**
     * 当前字符串标记
     */
    private String currentToken;

    public Context(String text) {
        //通过传入的指令字符串创建StringTokenizer对象
        tokenizer = new StringTokenizer(text);
        nextToken();
    }


    /**
     * 返回下一个标记
     * @return
     */
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }



    /**
     * 跳过一个标记
     * @param token
     */
    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            System.err.println("错误提示：" + currentToken + "解释错误！");
        }
        nextToken();
    }



    /**
     * 如果当前的标记是一个数字，则返回对应的数值
     * @return
     */
    public int currentNumber() {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
            //将字符串转换为整数
        } catch (NumberFormatException e) {
            System.err.println("错误提示：" + e);
        }
        return number;
    }

    /**
     * 返回当前的标记
     * @return
     */
    public String getCurrentToken() {
        return currentToken;
    }
}
