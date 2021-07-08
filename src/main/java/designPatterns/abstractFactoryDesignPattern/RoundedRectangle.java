package designPatterns.abstractFactoryDesignPattern;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a " + RoundedRectangle.class.getSimpleName());
    }
}
