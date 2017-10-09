package TwoDimensionalShapes;

import TwoDimensionalShapes.Quadrilaterals.Rectangle;
import TwoDimensionalShapes.Triangles.Triangle;

public class ShapeUtils {

    public String isRectangle(TwoDimensionalShape potentialRectangleShape) {
        return potentialRectangleShape instanceof Rectangle ? "This is a rectangle." : "This is NOT a rectangle";
    }

    public String isTriangle(TwoDimensionalShape potentialTriangleShape) {
        return potentialTriangleShape instanceof Triangle ? "This is a triangle." : "This is NOT a triangle";
    }
}
