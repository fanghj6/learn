package com.version2.behavior.resolve.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/22  18:23
 **/
public class Client {

    public static void main(String[] args) {
        //LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉 END"

        //解释器毛模式
        //角色：抽象表达式，终结表达式，非终结表达式
        //String str = "LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉 END";
        //String str = "LOOP 5 SPACE PRINT 测试 SPACE  PRINT OK END SPACE PRINT 。 ";
        String str ="LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END LOOP 2  PRINT 郭靖 SPACE SPACE PRINT 黄蓉 BREAK END";
        Context context = new Context(str);
        Resolve resolve = new Hander();
        resolve.builder(context);
        resolve.execute();
    }
}
