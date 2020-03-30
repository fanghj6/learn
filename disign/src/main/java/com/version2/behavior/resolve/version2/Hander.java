package com.version2.behavior.resolve.version2;


import java.util.ArrayList;
import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Hander
 * @Description TODO
 * @date 2020/3/22  20:07
 **/
public class Hander implements Resolve{

    private List<Resolve> list = new ArrayList<>();

    @Override
    public void builder(Context context) {

        while (true){
            context.nextToken();
            if("END".equals(context.currentToken()) || context.currentToken() == null){
                break;
            }

            if("LOOP".equals(context.currentToken())){
                Resolve resolve = new LoopNode();
                resolve.builder(context);
                list.add(resolve);
            }else{
                Resolve resolve = new Primary();
                resolve.builder(context);
                list.add(resolve);
            }
        }

    }

    @Override
    public void execute() {
        for (Resolve resolve : list) {
            resolve.execute();
        }
    }
}
