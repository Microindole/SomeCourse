package org.csu.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
    @Override
    public void insert() {
        System.out.println("新增一行记录");
    }

    @Override
    public void delete() {
        System.out.println("删除一行记录");
    }

    @Override
    public void update() {
        System.out.println("更新一行记录");
    }

    @Override
    public void find() {
        System.out.println("查询一行记录");
    }
}
