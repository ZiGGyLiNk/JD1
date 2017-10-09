package TwoDimensionalShapes;

import Geometry.Point;

public class Circle extends TwoDimensionalShape {

    public Geometry.Point circleCenterPoint;
    public Geometry.Point circleEdgePoint;
    public String shapeName;

    public Circle(Point circleCenterPoint, Point circleEdgePoint, String shapeName) {
        this.circleCenterPoint = circleCenterPoint;
        this.circleEdgePoint = circleEdgePoint;
        this.shapeName = shapeName;
    }

    @Override
    public double getArea(TwoDimensionalShape circle) {
        double radius = circleCenterPoint.distance(circleEdgePoint);
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " + shapeName + ". Area: " + getArea(this);
    }
}
