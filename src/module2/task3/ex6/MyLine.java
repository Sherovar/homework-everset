package src.module2.task3.ex6;

import src.module2.task3.ex5.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;


    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY(int y){
        begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public int[] getBeginXY(){
        return begin.getXY();
    }

    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }

    public int[] getEndXY(){
        return end.getXY();
    }

    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient(){
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
