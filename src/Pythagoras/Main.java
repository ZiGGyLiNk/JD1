package Pythagoras;
import java.util.Scanner;
/**
 * Lesson 6, task 1.
 * @author a.bissenek
 */
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's create our first point. Please input its coordinate on X axis:");
        point1.setXCoordinate(scanner.nextDouble());
        System.out.println("Please input its coordinate on Y axis:");
        point1.setYCoordinate(scanner.nextDouble());

        System.out.println("Now, let's create our second point. Please input its coordinate on X axis:");
        point2.setXCoordinate(scanner.nextDouble());
        System.out.println("Please input second point's coordinate on Y axis:");
        point2.setYCoordinate(scanner.nextDouble());

        if (point1.getXCoordinate() < point2.getXCoordinate() && point1.getYCoordinate() != point2.getYCoordinate()) {
            Rectangle rectangle = new Rectangle(point1, point2);
            System.out.println("If our two points are the coordinates of the opposite rectangle corners, its diagonal length would be: " + rectangle.rectangleDiagonalLength(point1, point2));
            System.out.println("And this rectangle's area would be: " + rectangle.rectangleArea(point1, point2));
        } else if (point1.getXCoordinate() > point2.getXCoordinate() && point1.getYCoordinate() != point2.getYCoordinate()) {
            Rectangle rectangle = new Rectangle(point1, point2);
            System.out.println("If our two points are the coordinates of the opposite rectangle corners, its diagonal length would be: " + rectangle.rectangleDiagonalLength(point1, point2));
            System.out.println("And this rectangle's area would be: " + rectangle.rectangleArea(point1, point2));
        } else {
            System.out.println("Distance between our two points is: " + point1.distance(point2));
        }
    }
}