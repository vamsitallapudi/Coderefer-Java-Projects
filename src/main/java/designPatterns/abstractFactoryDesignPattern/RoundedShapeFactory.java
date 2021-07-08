package designPatterns.abstractFactoryDesignPattern;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String name) {
        String shapeType = name.toUpperCase();
        return switch (shapeType) {
            case "CIRCLE" -> new RoundedCircle();
            case "RECTANGLE" -> new RoundedRectangle();
            case "SQUARE" -> new RoundedSquare();
            default -> null;
        };
    }
}
