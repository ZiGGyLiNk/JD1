package TwoDimensionalShapes.Quadrilaterals;

import TwoDimensionalShapes.Point;
import TwoDimensionalShapes.TwoDimensionalShape;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(Point point1, Point point2, Point point3, Point point4, String shapeName) {
        super(point1, point2, point3, point4, shapeName);
    }

    @Override
    public double getArea(TwoDimensionalShape parallelogram) {
        return point1.distance(point2) * point2.distance(point3);
    }

    @Override
    public String toString() {
        return "Parallelogram: " + shapeName + ". Area: " + getArea(this);
    }
}