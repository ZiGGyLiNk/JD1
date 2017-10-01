package Pythagoras;
/**
 * Lesson 6, task 1.
 * @author a.bissenek
 */
class Rectangle {
    private double upperLeftXCoordinate;
    private double upperLeftYCoordinate;
    private double bottomRightXCoordinate;
    private double bottomRightYCoordinate;
    private Point upperLeft = new Point (0, 0);
    private Point bottomRight = new Point (0, 0);

    Rectangle(double upperLeftXCoordinate, double upperLeftYCoordinate, double bottomRightXCoordinate, double bottomRightYCoordinate) {
        this.upperLeftXCoordinate = upperLeftXCoordinate;
        this.upperLeftYCoordinate = upperLeftYCoordinate;
        this.bottomRightXCoordinate = bottomRightXCoordinate;
        this.bottomRightYCoordinate = bottomRightYCoordinate;
    }

    void print() {
        System.out.println(upperLeft.getXCoordinate() + upperLeft.getYCoordinate() + bottomRight.getXCoordinate() + bottomRight.getYCoordinate());
    }

    double rectangleDiagonalLength() {
        upperLeft.setXCoordinate(upperLeftXCoordinate);
        upperLeft.setYCoordinate(upperLeftYCoordinate);
        bottomRight.setXCoordinate(bottomRightXCoordinate);
        bottomRight.setYCoordinate(bottomRightYCoordinate);
        return Point.distance(upperLeft.getXCoordinate(), upperLeft.getYCoordinate(), bottomRight.getXCoordinate(), bottomRight.getYCoordinate());
    }

    double rectangleArea() {
        upperLeft.setXCoordinate(upperLeftXCoordinate);
        upperLeft.setYCoordinate(upperLeftYCoordinate);
        bottomRight.setXCoordinate(bottomRightXCoordinate);
        bottomRight.setYCoordinate(bottomRightYCoordinate);
        return Point.distance(upperLeft.getXCoordinate(), upperLeft.getYCoordinate(), bottomRight.getXCoordinate(), bottomRight.getYCoordinate()) * Point.distance(upperLeft.getXCoordinate(), upperLeft.getYCoordinate(), bottomRight.getXCoordinate(), bottomRight.getYCoordinate());
    }
}