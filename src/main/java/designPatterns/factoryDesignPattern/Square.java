package designPatterns.factoryDesignPattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a " + Square.class.getSimpleName());
    }
}
