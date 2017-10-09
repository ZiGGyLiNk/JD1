package TwoDimensionalShapes.Triangles;

import TwoDimensionalShapes.Point;
import TwoDimensionalShapes.TwoDimensionalShape;
import static java.lang.Math.round;

public class Triangle extends TwoDimensionalShape {

    public Point point1;
    public Point point2;
    public Point point3;
    String shapeName;

    public double triangleBase = point1.distance(point2);
    public boolean isBase = point1.getYCoordinate() == point2.getYCoordinate();

    public Triangle(Point point1, Point point2, Point point3, String shapeName) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.shapeName = shapeName;
    }

    public double getAltitude (TwoDimensionalShape triangle) {
        double p = 0.5 * (point1.distance(point2) + point1.distance(point3) + point2.distance(point3));
        return round((2 * Math.sqrt(p * (p - triangleBase) * (p - point1.distance(point3)) * (p - point2.distance(point3)))) / triangleBase);
    }

    @Override
    public double getArea (TwoDimensionalShape triangle) {
        return (triangleBase * getAltitude(triangle)) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: " + shapeName + ". Area: " + getArea(this);
    }
}