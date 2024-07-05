package com.goal.factory.method;

/**
 * 具体产品
 */
public class Apple extends Fruit {
    @Override
    public void grow() {
        System.out.println("Apple.grow");
    }
}
