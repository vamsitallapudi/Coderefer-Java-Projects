package designPatterns.factoryDesignPattern;

public class FactoryDPDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = factory.getShape("Square");
        shape3.draw();
    }
}
