package com.disign.command.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ConcreteCommand
 * @Description TODO
 * @date 2019/9/22  15:50
 **/
public class ConcreteCommand extends AbstractCommand {

    private Adder adder = new Adder();
    public List<Integer> values = new ArrayList<>();

    public int position ;

    @Override
    public int execute(int args) {
        values.add(args);
        position =values.size() -1;
        int result = adder.add(args);
        try {
            this.saveStatus(values);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("执行结果 result="+result+ " args ="+args);
        return result;
    }

    @Override
    public int undo() {
        if(this.values.size() > 0){
            int result = adder.add(-values.get(position));
            values.remove(values.size()-1);
            position =values.size() -1;
            try {
                this.saveStatus(values);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("撤销结果 result="+result);
            return result;
        }
        System.out.println("撤销结果 result="+0);
        return 0;
    }

    @Override
    public void restore() throws Exception {
        System.out.println("断电恢复状态");
        //清空数据
        this.values = new ArrayList<>();
        this.position = 0;
        adder.setValue(0);

        try {
            List<Integer> list = (List<Integer>) this.readStatus();
            for (Integer integer : list) {
                this.execute(integer);
            }
        } catch (Exception e) {
            System.out.println("断电恢复状态 异常");
            e.printStackTrace();
        }

    }
}
