package com.disign.command.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ConcreteCommand
 * @Description TODO
 * @date 2019/9/22  15:50
 **/
public class ConcreteCommand implements AbstractCommand {

    private Adder adder = new Adder();
    public List<Integer> values = new ArrayList<>();

    public int position ;

    @Override
    public int execute(int args) {
        values.add(args);
        position =values.size() -1;
        return adder.add(args);
    }

    @Override
    public int undo() {
        if(this.values.size() > 0){
            int result = adder.add(-values.get(position));
            values.remove(values.size()-1);
            position =values.size() -1;
            return result;
        }
        return 0;
    }
}
