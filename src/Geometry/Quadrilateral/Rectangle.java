package Geometry.Quadrilateral;
import Geometry.Point;

public class Rectangle extends Parallelogram {

    public Rectangle(String shapeName, Point point1, Point point2, Point point3, Point point4) {
        super(shapeName, point1, point2, point3, point4);
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}