package com.goal.spring6.bean;

/**
 * 静态工厂创建Bean
 */
public class AppleFactory {

    public static Apple get() {
        System.out.println("原厂的Apple就是甜");
        return new Apple();
    }

}
