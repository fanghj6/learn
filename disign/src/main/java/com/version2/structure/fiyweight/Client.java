package com.version2.structure.fiyweight;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/20  9:29
 **/
public class Client {

    public static void main(String[] args) {
        //享元模式
        //角色：抽象享元类，具体享元类，非共享具体享元类，享元工厂类
        //类型：享元模式有单纯享元和复合享元。复合享元可拆分成单纯享元，一般是单纯享元的组合

        //带外部状态的单纯享元

        FiyweightFactory fiyweightFactory = FiyweightFactory.newInstance();
        ChessFiyweight whiteChess = fiyweightFactory.getChess("white");

        whiteChess.display(new Coordinate("1","1"));
        ChessFiyweight blackChess  = fiyweightFactory.getChess("black");
        blackChess.display(new Coordinate("1","1"));

        ChessFiyweight blackChess1  = fiyweightFactory.getChess("black");
        System.out.println(whiteChess == blackChess);
        System.out.println(blackChess == blackChess1);
    }
}
