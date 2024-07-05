package com.goal.factory.method;

public class OrangeFactory extends FruitsFactory {

    @Override
    public Fruit get() {
        return new Orange();
    }
}
