package com.disign.shared;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/9/8  16:02
 **/
public class Client {


    public static void main(String[] args) {
        //享元模式
       PieceFactory pieceFactory = PieceFactory.getInstance();

      Piece black1 =  pieceFactory.get("black");
      Piece black2 =  pieceFactory.get("black");
      Piece black3 =  pieceFactory.get("black");
      black1.display(new Coordinates(1,1));
      black2.display(new Coordinates(1,2));
      black3.display(new Coordinates(1,3));

      Piece white1 =  pieceFactory.get("white");
      Piece white2 =  pieceFactory.get("white");
      Piece white3 =  pieceFactory.get("white");
      white1.display(new Coordinates(2,1));
      white2.display(new Coordinates(3,2));
      white3.display(new Coordinates(4,3));
    }
}
