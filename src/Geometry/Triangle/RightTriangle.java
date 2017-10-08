package Geometry.Triangle;
import Geometry.Point;

public class RightTriangle extends Triangle {

    public RightTriangle(String shapeName, Point point1, Point point2, Point point3) {
        super(shapeName, point1, point2, point3);
    }

    @Override
    public double getAltitude() {
        double altitude = 0;
        if (isBase) {
            altitude = ((point1.distance(point3)) * (point2.distance(point3))) / this.triangleBase;
        }
        return altitude;
    }

    @Override
    public double getArea () {
        return (this.triangleBase * getAltitude()) / 2;
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}