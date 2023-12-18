package src.module2.lesson2;

public class Circle1_0 {
    private double radius = 1.0;
    private String colour = "red";

    public Circle1_0() {
    }

    public Circle1_0(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
