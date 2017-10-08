package Geometry.Quadrilateral;
import Geometry.Point;
import Geometry.Usable;

public abstract class Quadrilateral implements Usable {

    public Point point1 = new Point(0, 0);
    public Point point2 = new Point(0, 0);
    public Point point3 = new Point(0, 0);
    public Point point4 = new Point(0, 0);

    private String shapeName;

    public Quadrilateral(String shapeName, Point point1, Point point2, Point point3, Point point4) {
        this.shapeName = shapeName;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public double getDiagonalLength() {
        return point1.distance(point3);
    }

    public double getArea() {
        double p = (point1.distance(point2) + point2.distance(point3) + point3.distance(point4) + point1.distance(point4)) / 2;
        return Math.sqrt((p - point1.distance(point2)) * (p - point2.distance(point3)) * (p - point3.distance(point4)) * (p - point1.distance(point4)));
    }

    public boolean isEqualInArea(Quadrilateral quadrilateral) {
        return this.getArea() == quadrilateral.getArea();
    }

    public String getShapeName() {
        return shapeName;
    }
}