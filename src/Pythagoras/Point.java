package Pythagoras;
/**
 * Lesson 6, task 1.
 * @author a.bissenek
 */
class Point {
    private double xCoordinate;
    private double yCoordinate;

    Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    double getXCoordinate() { return xCoordinate; }
    double getYCoordinate() { return yCoordinate; }

    void setXCoordinate(double xCoordinate) { this.xCoordinate = xCoordinate; }
    void setYCoordinate(double yCoordinate) { this.yCoordinate = yCoordinate; }

    static double distance(double xCoordinate, double yCoordinate, double xCoordinate2, double yCoordinate2) {
        return Math.sqrt(Math.pow((xCoordinate2 - xCoordinate), 2) + Math.pow((yCoordinate2 - yCoordinate), 2));
    }
}