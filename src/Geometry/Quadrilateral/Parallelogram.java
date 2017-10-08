package Geometry.Quadrilateral;

import Geometry.Point;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(String shapeName, Point point1, Point point2, Point point3, Point point4) {
        super(shapeName, point1, point2, point3, point4);
    }

    @Override
    public double getArea() {
        return point1.distance(point2) * point2.distance(point3);
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}