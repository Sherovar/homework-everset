package src.module2.lesson2;

public class Rectangle1_0 {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle1_0(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle1_0() {
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return length * width;
    }

    public float getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
