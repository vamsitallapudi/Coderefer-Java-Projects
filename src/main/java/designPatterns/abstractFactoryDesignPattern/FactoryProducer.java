package designPatterns.abstractFactoryDesignPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
