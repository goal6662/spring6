package com.goal.factory.method;

/**
 * 具体工厂
 */
public class AppleFactory extends FruitsFactory {
    @Override
    public Fruit get() {
        return new Apple();
    }
}
