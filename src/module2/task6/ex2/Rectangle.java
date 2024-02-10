package src.module2.task6.ex2;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
