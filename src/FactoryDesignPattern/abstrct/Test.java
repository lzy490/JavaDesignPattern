package FactoryDesignPattern.abstrct;

/**
 * 抽象工厂是工厂方法的改进，当每个对象需要创建额外的附属对象时，不需要新建此类对象的工厂方法，可以使用原先的工厂方法
 * 抽象工厂和工厂方法的区别是：工厂方法，每个工厂只能创建一个对象。抽象工厂，每个工厂能创建多个对象
 * */
public class Test {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.create();
        factoryA.createRelation();
    }
}
