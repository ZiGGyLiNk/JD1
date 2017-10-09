package TwoDimensionalShapes.Quadrilaterals;

import TwoDimensionalShapes.Point;

public class Square extends Rectangle {

    public Square(Point point1, Point point2, Point point3, Point point4, String shapeName) {
        super(point1, point2, point3, point4, shapeName);
    }

    @Override
    public String toString() {
        return "Square: " + shapeName + ". Area: " + this.getArea();
    }
}
