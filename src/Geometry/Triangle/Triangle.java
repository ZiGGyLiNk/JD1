package Geometry.Triangle;
import Geometry.Point;
import Geometry.Usable;

public class Triangle implements Usable {

    public Point point1 = new Point(0, 0);
    public Point point2 = new Point(0, 0);
    public Point point3 = new Point(0, 0);


    public double triangleBase = point1.distance(point2);
    public boolean isBase = point1.getYCoordinate() == point2.getYCoordinate();
    private String shapeName;

    public Triangle (String shapeName, Point point1, Point point2, Point point3){
        shapeName = this.shapeName;
        point1 = this.point1;
        point2 = this.point2;
        point3 = this.point3;
    }

    public double getAltitude () {
        double p = 0.5 * (point1.distance(point2) + point1.distance(point3) + point2.distance(point3));
        return (2 * Math.sqrt(p * (p - triangleBase) * (p - point1.distance(point3)) * (p - point2.distance(point3)))) / triangleBase;
    }

    public double getArea () {
        return (triangleBase * getAltitude()) / 2;
    }

    public boolean isEqualInArea(Triangle triangle) {
        return this.getArea() == triangle.getArea();
    }

    public String getShapeName () {
        return shapeName;
    }
}