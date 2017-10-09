package TwoDimensionalShapes;

public abstract class TwoDimensionalShape {

    public TwoDimensionalShape() { }

    public double getArea (TwoDimensionalShape twoDimensionalShape) {
        return 0;
    }

    public boolean isEqualInArea (TwoDimensionalShape otherShape) {
        return getArea(this) == getArea(otherShape);
    }
}
