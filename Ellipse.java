package fr.ensea.Project2A.PaintProject;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Figure {
    protected float semiAxysX;
    protected float semiAxysY;

    public Ellipse() {
        this(0, 0, new Color(0, 0, 0));
    }

    public Ellipse(int px, int py, Color color) {
        super(color, new Point(px,py));
        setBoundingBox(0,0);
    }

    public void draw(Graphics g) {
    }

    public int getLength() {
        return 2*heightBB;
    }

    public int getPerimeter() {
        return 2 * (2*widthBB + 2*heightBB);
    }

    public int getSurface() {
        return (2*widthBB) * (2*heightBB);
    }

    public int getWidth() {
        return 2*widthBB;
    }

    public void setBoundingBox(int heigthBB, int widthBB) {
        semiAxysX = widthBB/2;
        semiAxysY = heightBB/2;
    }

    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }

    public void setSemiAxysY(int semiAxysY) {
        this.semiAxysY = semiAxysY;
    }

    @Override
    public String toString() {
        return "Demi-grand axe de largeur = " + this.semiAxysX +
                " Demi-grand axe de hauteur = " + this.semiAxysY +
                " Couleur :" + this.c;
    }

    public static void main(String[] args) {
        Ellipse Ellipse_1 = new Ellipse();
        System.out.println(Ellipse_1);
        Color c_2 = new Color(0, 0, 255);
        Ellipse Ellipse_2 = new Ellipse(20, 20, c_2);
        System.out.println(Ellipse_2);
    }
}
