package FactoryDesignPattern.method;

import FactoryDesignPattern.Item;
import FactoryDesignPattern.ItemB;

public class ItemBFactory implements Factory {
    @Override
    public Item create() {
        return new ItemB();
    }
}
