package src.module2.task5.ex1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }


    public int getBeginY() {
        return begin.getY();
    }

    public void setBegin(int beginY) {
        this.begin.setY(beginY);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }


    public int getLength(){
        return (int) Math.sqrt(Math.pow(begin.getX() - end.getX(),2) + Math.pow(begin.getY() - end.getY(), 2));
    }

    public double getGradient(){
        return Math.atan2(end.getX() - begin.getX(), end.getY() - begin.getY());
    }
}
