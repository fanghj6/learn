package com.behavior.interpreter.version;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/12/27  10:00
 **/
public class Client {

    public static void main(String[] args) {
        Node node = new InterpreterNode();
        Context context = new Context("loop 5 space print 测试 space  print ok end space print 。 ");
        node.interpreter(context);
        node.execute();
    }
}
