package Geometry.Triangle;
import Geometry.Point;

public class EquilateralTriangle extends Triangle {

    private boolean isEquilateral = point1.distance(point3) == point2.distance(point3);

    public EquilateralTriangle(String shapeName, Point point1, Point point2, Point point3) {
        super(shapeName, point1, point2, point3);
    }

//    @Override
    public double getAltitude(Triangle equilateralTriangle) {
        double altitude = 0;
        if (isBase && isEquilateral) {
            altitude = Math.sqrt(Math.pow(point1.distance(point3), 2) - Math.pow(triangleBase, 2) / 4);
        }
        return altitude;
    }

    @Override
    public double getArea () {
        return (triangleBase * getAltitude(this)) / 2;
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}