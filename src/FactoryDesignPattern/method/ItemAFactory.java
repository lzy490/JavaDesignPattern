package FactoryDesignPattern.method;

import FactoryDesignPattern.Item;
import FactoryDesignPattern.ItemA;

public class ItemAFactory implements Factory {
    @Override
    public Item create() {
        return new ItemA();
    }
}
