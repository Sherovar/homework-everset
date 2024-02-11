package src.module2.task6.ex8;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint topRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    @Override
    public void moveUp() {
        topRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        topRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        topRight.moveRight();
        topLeft.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                '}';
    }
}
