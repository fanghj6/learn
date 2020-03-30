package practice.create.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020/3/30  16:04
 **/
public class Client {

    public static void main(String[] args) {
        //简单工厂模式
        //角色，工厂类，抽象产品，具体产品
        Product product = ProductFactory.getProduct("t");
        product.display();
    }
}
