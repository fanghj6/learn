package com.version2.structure.fiyweight;

import java.util.HashMap;

/**
 * @author fhj
 * @version 1.0
 * @ClassName FiyweightFactory
 * @Description TODO
 * @date 2020/3/20  9:46
 **/
public class FiyweightFactory {

    private HashMap<String,ChessFiyweight> map = new HashMap<>();

    private FiyweightFactory(){
        ChessFiyweight whiteChess = new Chess();
        whiteChess.setColor(new White());
        ChessFiyweight blackChess = new Chess();
        blackChess.setColor(new Black());
        map.put("white",whiteChess);
        map.put("black",blackChess);
    }

    static class SingletonFactory{
        private static FiyweightFactory fiyweightFactory = new FiyweightFactory();
    }

    public static FiyweightFactory newInstance(){
        return SingletonFactory.fiyweightFactory;
    }

    public  ChessFiyweight getChess(String type){
        return map.get(type);
    }


}
