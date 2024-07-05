package com.goal.spring6.factory;

/**
 * 具体工厂类
 */
public class GunFactory {

    /**
     * 该方法不是静态的
     *  创建对象也需要交由Spring管理
     * @return 具体角色
     */
    public Gun get() {
        System.out.println("GunFactory.get");
        return new Gun();
    }
}
