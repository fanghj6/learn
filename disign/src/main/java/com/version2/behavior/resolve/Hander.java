package com.version2.behavior.resolve;

import org.springframework.util.StringUtils;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/21  21:09
 **/
public class Hander {

    private Resolve resolve;

    public void init(String str){
        StringTokenizer tokenizer = new StringTokenizer(str);
        Stack<Resolve> stack = new Stack<>();
        while (true){
            String token = tokenizer.nextToken();
            if("end".equals(token)){

                break;
            }

            if("and".equals(token)){
                Resolve left = stack.pop();
                Resolve direction = new Direction(tokenizer.nextToken());
                Resolve primary = new Primary(tokenizer.nextToken(), tokenizer.nextToken());
                Resolve right = new Node(direction,primary);
                And and = new And(left,right);
                stack.push(and);

            }else{
                Resolve direction = new Direction(token);
                Resolve primary = new Primary(tokenizer.nextToken(), tokenizer.nextToken());
                Node node = new Node(direction,primary);
                stack.push(node);
            }
        }
        this.resolve = stack.pop();
    }

    public void execute(){
        System.out.println( resolve.execute());
    }
}
