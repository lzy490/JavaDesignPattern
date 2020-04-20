package FactoryDesignPattern.method;

/**
 * 工厂方法模式：使用多态，定义一个公共的工厂接口。生成不同对象的工厂实现该接口。当新增工厂时，对原先的工厂类没有影响，只需要新增对应的工厂类就行。
 * 符合开放闭合的原则
 * */
public class Test {
    public static void main(String[] args) {
        Factory factoryA = new ItemAFactory();
        Factory factoryB = new ItemBFactory();
        factoryA.create();
        factoryB.create();
    }
}
