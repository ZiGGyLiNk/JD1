package Geometry;

public class Circle implements Usable {

    public Point circleCenter = new Point(0, 0);
    public Point circleEdge = new Point(0, 0);
    private String shapeName;

    Circle (String shapeName, double radius) { }

    public double getArea() {
        double radius = circleCenter.distance(circleEdge);
        return Math.PI * Math.pow(radius, 2);
    }

    public String getShapeName () {
        return shapeName;
    }

    public boolean isEqualInArea(Circle circle) {
        return this.getArea() == circle.getArea();
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}