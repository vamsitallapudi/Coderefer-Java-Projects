package designPatterns.abstractFactoryDesignPattern;

public class AbstractFactoryDPDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = factory.getShape("Square");
        shape3.draw();

//        now referencing to rounded abstract factory
        factory = FactoryProducer.getFactory(true);
        Shape shape4 = factory.getShape("CIRCLE");
        shape4.draw();
        Shape shape5 = factory.getShape("Rectangle");
        shape5.draw();
        Shape shape6 = factory.getShape("Square");
        shape6.draw();
    }
}
