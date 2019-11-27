package com.disign.memo;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Originator
 * @Description TODO
 * @date 2019/9/29  20:51
 **/
public class Originator {

    private String lable;

    private int x ;

    private int y ;

    public Originator(String lable, int x, int y) {
        this.lable = lable;
        this.x = x;
        this.y = y;
    }

    public  Memorandum save(){
        return new Memorandum(lable,x,y);
    }

    public void restore(Memorandum memorandum){
        if(memorandum == null){
            System.out.println("已经回退到最初位置，无法在回退");
            return;
        }
        this.lable = memorandum.getLable();
        this.x = memorandum.getX();
        this.y = memorandum.getY();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLable() {
        return lable;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
