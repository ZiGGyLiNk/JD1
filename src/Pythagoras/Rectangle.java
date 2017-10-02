package Pythagoras;
/**
 * Lesson 6, task 1.
 * @author a.bissenek
 */
class Rectangle {
    private Point upperLeft = new Point (0, 0);
    private Point bottomRight = new Point (0, 0);

    Rectangle(Point upperLeft, Point bottomRight) { }

    double rectangleDiagonalLength(Point upperLeft, Point bottomRight) {
        return upperLeft.distance(bottomRight);
    }

    double rectangleArea(Point upperLeft, Point bottomRight) {
        Point thirdPoint = new Point(upperLeft.getXCoordinate(), bottomRight.getYCoordinate());
        return thirdPoint.distance(upperLeft) * thirdPoint.distance(bottomRight);
    }
}