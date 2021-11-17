package fr.ensea.Project2A.PaintProject;

import java.io.Serializable;

public class Point implements Serializable {

    private int X;
    private int Y;

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public Point() {
        X = 0;
        Y= 0;
    }

    public int getX() { return X; }

    public int getY() { return Y; }

    public void setX(int X) {this.X = X; }

    public void setY(int Y) {this.Y = Y;}

    @Override
    public String toString() {
        return "X = " + this.X +
                " Y = " + this.Y;
    }
    public static void main(String[] args) {
        Point Point_1 = new Point(1,1);
        System.out.println(Point_1);
        Point Point_2 = new Point();
        System.out.println(Point_2);
    }
}
