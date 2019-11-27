package com.disign.status.version2;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2019/11/19  15:08
 **/
public class Client {

    public static void main(String[] args) {
        Book b1 = new Book("b1");
        Book b2 = new Book("b2");
        Book b3 = new Book("b3");
        Book b4 = new Book("b4");
        Book b5 = new Book("b5");
        Book b6 = new Book("b6");
        Book b7 = new Book("b7");
        Book b8 = new Book("b8");


        BookManager bookManager = new BookManager();


        bookManager.borrow(b1);
        bookManager.borrow(b2);
        bookManager.borrow(b3);
        bookManager.borrow(b4);
        bookManager.borrow(b5);
        bookManager.borrow(b6);
        bookManager.borrow(b7);
        bookManager.borrow(b8);

        bookManager.borrow(b6);
        bookManager.borrow(b7);
        bookManager.borrow(b8);

        bookManager.also(b2);

        bookManager.borrow(b6);

        System.out.println(bookManager);
    }
}
