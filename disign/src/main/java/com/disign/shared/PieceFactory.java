package com.disign.shared;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author fhj
 * @version 1.0
 * @ClassName PieceFactory  享元工厂
 * @Description TODO
 * @date 2019/9/8  15:54
 **/
public class PieceFactory {

    private static Map<String,Piece> map;

    private static PieceFactory pieceFactory = new PieceFactory();

    private PieceFactory() {
        map = new Hashtable<>();
        map.put("black",new BlackPiece());
        map.put("white",new WhitePiece());
    }

    public static   PieceFactory getInstance(){
        return pieceFactory;
    }

    public void add(String key,Piece piece){
        map.put(key,piece);
    }

    public Piece get(String key){
       return map.get(key);
    }
}
