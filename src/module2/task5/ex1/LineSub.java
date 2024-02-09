package src.module2.task5.ex1;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getEnd(){
        return end;
    }

    public Point getBegin(){
        return new Point(super.getX(), super.getY());
    }

    public void setBegin(Point begin){
        super.setXY(begin.getX(),begin.getY());
    }

    public void setEnd(Point end){
        this.end = end;
    }

    public int getBeginX(){
        return super.getX();
    }

    public int getBeginY(){
        return super.getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getX();
    }

    public void setBeginX(int beginX){
        super.setX(beginX);
    }

    public void sebBeginY(int beginY){
        super.setY(beginY);
    }

    public void setEndX(int endX){
        end.setX(endX);
    }

    public void setEndY(int endY){
        end.setY(endY);
    }

    public int getLength(){
        return (int) Math.sqrt(Math.pow(super.getX() - end.getX(),2) + Math.pow(super.getY() - end.getY(), 2));
    }

    public double getGradient(){
        return Math.atan2(end.getX() - super.getX(), end.getY() - super.getY());
    }


    @Override
    public String toString() {
        return "LineSub{" +
                "begin=" + super.toString() +
                "end=" + end +
                '}';
    }
}
