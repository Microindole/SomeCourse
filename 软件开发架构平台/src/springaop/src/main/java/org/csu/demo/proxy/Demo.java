package org.csu.demo.proxy;

public class Demo {
    public static void main(String[] args) {
//        ProductDao productDao = new ProductDaoImpl();
        ProductDao productDao = (ProductDao) ProxyDemo1.bind(new ProductDaoImpl());



        productDao.insert();
        productDao.update();
        productDao.delete();
        productDao.find();
    }
}
