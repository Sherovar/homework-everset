package src.module2.task6.ex1;

public class Square extends  Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public double getSide(){
        return this.length;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                '}';
    }
}
