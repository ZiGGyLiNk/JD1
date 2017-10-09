package TwoDimensionalShapes.Triangles;

import TwoDimensionalShapes.Point;
import TwoDimensionalShapes.TwoDimensionalShape;

public class RightTriangle extends Triangle {

    public RightTriangle(Point point1, Point point2, Point point3, String shapeName) {
        super(point1, point2, point3, shapeName);
    }

    @Override
    public double getAltitude(TwoDimensionalShape rightTriangle) {
        double altitude = 0;
        if (isBase) {
            altitude = ((point1.distance(point3)) * (point2.distance(point3))) / triangleBase;
        } else {
            System.out.println("This is not a right triangle!");
        }
        return altitude;
    }

    @Override
    public double getArea (TwoDimensionalShape rightTriangle) {
        return (triangleBase * getAltitude(rightTriangle)) / 2;
    }

    @Override
    public String toString() {
        return "Right triangle: " + shapeName + ". Area: " + getArea(this);
    }
}
