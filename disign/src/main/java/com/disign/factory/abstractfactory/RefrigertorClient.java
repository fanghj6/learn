package com.disign.factory.abstractfactory;

/**
 * @author fhj
 * @version 1.0
 * @ClassName RefrigertorClient
 * @Description TODO
 * @date 2019/8/21  17:19
 **/
public class RefrigertorClient {

    public static void main(String[] args) {
        RefrigertorClient client = new RefrigertorClient();
        client.refrigertor("VipRefrigertorFactory");
        client.refrigertor("OrdinaryRefrigertorFactory");
    }
        public static final String packageName = "com.disign.disign.factory.abstractfactory." ;

    private  void refrigertor(String className) {
        RefrigertorFactory refrigertorFactory = null;
        try {
            refrigertorFactory = (RefrigertorFactory) Class.forName(packageName+className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Freezing freezing = refrigertorFactory.createFreezing();
        Refrigeration refrigeration = refrigertorFactory.createRefrigeration();
        freezing.freezing();
        refrigeration.refrigeration();
    }
}
