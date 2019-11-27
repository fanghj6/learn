package com.disign.interpreter.version1;

import java.util.Stack;

/**
 * @author fhj
 * @version 1.0
 * @ClassName InstructionHandler
 * @Description TODO
 * @date 2019/9/23  21:25
 **/
public class InstructionHandler {

    private AbstractNode node;

    public void handle(String instruction){
        AbstractNode left=null,right=null;
        AbstractNode direction=null,action=null,distance=null;
        //声明一个栈对象用于存储抽象语法树
        Stack stack=new Stack();
        //以空格分隔指令字符串
        String[] words = instruction.split(" ");
        for(Integer i=0;i<words.length;i+=3){
            if(words[i].equalsIgnoreCase("and")) {
                 ++i;
                //弹出栈顶表达式作为左
                left = (AbstractNode) stack.pop();
                right =getNode( words,i);
                //将新表达式压入栈
                stack.push(new AndNode(left, right));
            }
            else{
                left =getNode( words,i);
                //将新表达式压入栈中
                stack.push(left);
            }

        }
        //将全部表达式从栈中弹出
        this.node=(AbstractNode)stack.pop();
    }

    public String output(){
        //解释表达式
        String result=node.interpreter();
        return result;
    }

    private AbstractNode getNode(String[] words ,int i){
        AbstractNode direction=null,action=null,distance=null;
        String word1=words[i];
        direction=new DirectionNode(word1);
        String word2=words[++i];
        action=new ActionNode(word2);
        String word3=words[++i];
        distance=new DistanceNode(word3);
        return new SentenceNode(direction,action,distance);
    }
}
