package designPatterns.abstractFactoryDesignPattern;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        String myShapeType = shapeType.toUpperCase();
        return switch (myShapeType) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
