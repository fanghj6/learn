package practice.create.factory.simple;

/**
 * @author fhj
 * @version 1.0
 * @ClassName ProductFactory
 * @Description TODO
 * @date 2020/3/30  16:10
 **/
public class ProductFactory {

    public static Product getProduct(String type ){
        Product product = null;
        if("t".equals(type)){
            product = new Television();
        }else if("r".equals(type)){
            product = new Refrigerator();
        }
        return product;
    }
}
