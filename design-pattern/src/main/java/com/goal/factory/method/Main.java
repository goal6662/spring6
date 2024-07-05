package com.goal.factory.method;

public class Main {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        appleFactory.get().grow();

        OrangeFactory orangeFactory = new OrangeFactory();
        orangeFactory.get().grow();
    }

}
