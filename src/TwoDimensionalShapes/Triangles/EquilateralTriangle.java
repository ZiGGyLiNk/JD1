package TwoDimensionalShapes.Triangles;

import TwoDimensionalShapes.Point;
import TwoDimensionalShapes.TwoDimensionalShape;

import static java.lang.Math.round;

public class EquilateralTriangle extends Triangle {

    private boolean isEquilateral = point1.distance(point3) == point2.distance(point3) && point1.distance(point3) == point2.distance(point3);

    public EquilateralTriangle(Point point1, Point point2, Point point3, String shapeName) {
        super(point1, point2, point3, shapeName);
    }

    @Override
    public double getAltitude(TwoDimensionalShape eqilateralTriangle) {
        double altitude = 0;
        if (isBase && isEquilateral) {
            altitude = round(Math.sqrt(Math.pow(point1.distance(point3), 2) - Math.pow(triangleBase, 2) / 4));
        } else {
            System.out.println("This triangle is not an equilateral one!");
        }
        return altitude;
    }

    @Override
    public double getArea (TwoDimensionalShape equilateralTriangle) {
        return (triangleBase * getAltitude(equilateralTriangle)) / 2;
    }

    @Override
    public String toString() {
        return "Equilateral triangle: " + shapeName + ". Area: " + this.getArea(this);
    }
}