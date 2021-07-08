package designPatterns.factoryDesignPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a " + Rectangle.class.getSimpleName());
    }
}
