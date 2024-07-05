package com.goal.factory.simple;

/**
 * 工厂类
 */
public class SimpleFactory {

    public static void main(String[] args) {
        Weapon tank = SimpleFactory.get("TANK");
        tank.attack();
    }


    /**
     * 根据指定参数返回响应产品
     * @param weaponType 类别
     * @return 具体产品
     */
    public static Weapon get(String weaponType) {

        switch (weaponType) {
            case "TANK":
                return new Tank();
            case "DAGGER":
                return new Dagger();
            default:
                throw new RuntimeException("不支持当前类别的武器");
        }

    }
}
