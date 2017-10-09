package TwoDimensionalShapes.Quadrilaterals;

import TwoDimensionalShapes.Point;
import TwoDimensionalShapes.TwoDimensionalShape;

public abstract class Quadrilateral extends TwoDimensionalShape{

    public Point point1;
    public Point point2;
    public Point point3;
    public Point point4;
    public String shapeName;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4, String shapeName) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.shapeName = shapeName;
    }

    @Override
    public double getArea(TwoDimensionalShape quadrilateral) {
        double p = (point1.distance(point2) + point2.distance(point3) + point3.distance(point4) + point1.distance(point4)) / 2;
        return Math.sqrt((p - point1.distance(point2)) * (p - point2.distance(point3)) * (p - point3.distance(point4)) * (p - point1.distance(point4)));
    }
}