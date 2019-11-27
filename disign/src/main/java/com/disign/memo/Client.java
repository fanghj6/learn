package com.disign.memo;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client  备忘录模式
 * @Description TODO
 * @date 2019/9/29  20:59
 **/
public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("车",1,1);

        dispaly(originator);
        caretaker.setMemorandum(originator.save());
        originator.setY(2);
        dispaly(originator);
        caretaker.setMemorandum(originator.save());
        originator.setX(8);
        dispaly(originator);
        caretaker.setMemorandum(originator.save());

        System.out.println("===========回退============");
        originator.restore(caretaker.back());
        dispaly(originator);
        originator.restore(caretaker.back());
        dispaly(originator);
        originator.restore(caretaker.back());
        dispaly(originator);

        System.out.println("=======================");
        originator.setY(3);
        dispaly(originator);
        caretaker.setMemorandum(originator.save());
        originator.setX(9);
        dispaly(originator);
        caretaker.setMemorandum(originator.save());
        System.out.println("===========回退============");
        originator.restore(caretaker.back());
        dispaly(originator);
        originator.restore(caretaker.back());
        dispaly(originator);

    }

    private static void dispaly(Originator originator) {
        System.out.println(originator.getLable() + "=" + originator.getX() + "," + originator.getY());
    }
}
