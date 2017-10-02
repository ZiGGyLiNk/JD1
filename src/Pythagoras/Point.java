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

    public double getXCoordinate() { return xCoordinate; }
    public double getYCoordinate() { return yCoordinate; }

    public void setXCoordinate(double xCoordinate) { this.xCoordinate = xCoordinate; }
    public void setYCoordinate(double yCoordinate) { this.yCoordinate = yCoordinate; }

    public double distance(Point other) {
        return Math.sqrt(Math.pow((other.getXCoordinate() - this.getXCoordinate()), 2) + Math.pow((other.getYCoordinate() - this.getYCoordinate()), 2));
    }
}