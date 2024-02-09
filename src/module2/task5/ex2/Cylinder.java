package src.module2.task5.ex2;

public class Cylinder {
    private Circle circle;
    private double height;

    public Cylinder(Circle circle, double height) {
        this.circle = circle;
        this.height = height;
    }

    public Cylinder() {
        this.circle = new Circle();
        this.height = 1.0;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "circle=" + circle +
                ", height=" + height +
                '}';
    }
}
