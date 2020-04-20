package FactoryDesignPattern.simple;

import FactoryDesignPattern.Item;
import FactoryDesignPattern.ItemA;
import FactoryDesignPattern.ItemB;

/**
 * 简单工厂模式
 * 由一个工厂类根据不同类型, 创建不同对象.违背了开防封闭（对拓展开放,对修改关闭）的原则,当新增一个对象时,需要修改工厂逻辑。
 * */
public class Factory {

    public static Item createItem(String type) {
        if ("A".equals(type)) {
            return new ItemA();
        } else {
            return new ItemB();
        }
    }
}
