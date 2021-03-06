package fr.ensea.Project2A.PaintProject;

import java.awt.Color;


public class Circle extends Ellipse {

    protected int radius;

    // Constructors

    public Circle() {
        this(0, 0, new Color(0, 0, 0));
    }

    public Circle(int px, int py, Color color) {
        super(px,py,color);
        setBoundingBox(0,0);
    }

    // Getters and setters

    public void setBoundingBox(int heightBB, int widthBB) {
        semiAxysY = Math.min(widthBB/2,heightBB/2);
        semiAxysX = Math.min(widthBB/2,heightBB/2);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Rayon :" + this.radius +
                " Couleur :" + this.c;
    }

    public static void main(String[] args) {
        Circle Circle_1 = new Circle();
        System.out.println(Circle_1);
        Color c_2 = new Color(0, 0, 255);
        Circle Circle_2 = new Circle(20, 20, c_2);
        System.out.println(Circle_2);
    }
}


