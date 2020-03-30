package practice.create.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Television
 * @Description TODO
 * @date 2020/3/30  16:08
 **/
public class Television implements Product {
    @Override
    public void display() {
        System.out.println("this is television");
    }
}
