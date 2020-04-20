package FactoryDesignPattern.abstrct;

import FactoryDesignPattern.Item;
import FactoryDesignPattern.RelationItem;

public interface Factory {
    Item create();

    RelationItem createRelation();
}
