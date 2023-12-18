package src.module2.lesson2;

public class Circle2_0 {
    private double radius = 1.0;

    public Circle2_0(double radius) {
        this.radius = radius;
    }

    public Circle2_0() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
