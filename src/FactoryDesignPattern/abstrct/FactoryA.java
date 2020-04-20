package FactoryDesignPattern.abstrct;

import FactoryDesignPattern.Item;
import FactoryDesignPattern.RelationItem;

public class FactoryA implements Factory {
    @Override
    public Item create() {
        return null;
    }

    @Override
    public RelationItem createRelation() {
        return null;
    }
}
