package fr.ensea.Project2A.PaintProject;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rectangle {

    protected int side;

    // Constructors

    public Square(){
        this(0,0,new Color(0,0,0));
    }

    public Square(int px, int py, Color color) {
        super(px,py,color);
        setBoundingBox(0,0);
    }

    // Getters and setters

    public void setBoundingBox(int side) {
        width = side;
        length = side;
    }

    public void setSide(int side) { this.side = side; }

    @Override
    public String toString() {
        return "Côté = " + this.side +
                " Couleur :" + this.c;
    }

    public static void main(String[] args) {
        Square Square_1 = new Square();
        System.out.println(Square_1);
        Color c_2 = new Color(0, 0, 255);
        Square Square_2 = new Square(20, 20, c_2);
        System.out.println(Square_2);
    }
}

