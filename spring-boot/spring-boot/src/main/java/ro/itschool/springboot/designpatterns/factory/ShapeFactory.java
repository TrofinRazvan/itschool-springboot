package ro.itschool.springboot.designpatterns.factory;

public class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return (Shape) new Square();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type " + shapeType);
        }
    }
}
