package fr.ensea.Project2A.PaintProject;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure {
    protected int length;
    protected int width;

    // Constructors

    public Rectangle() {
        this(0,0,new Color(0,0,0));
    }

    public Rectangle(Color c) {
        this(0,0,c);
    }

    public Rectangle(int px, int py, Color color) {
        super(color, new Point(px,py));
        setBoundingBox(0,0);
    }

    ////////////////

    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(origin.getX(), origin.getY(),width,length);
    }

    ///////////////

    // Getters and setters

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getLength() {return length;}
    public void setLength() { this.length = length; }

    public int getPerimeter() { return 2*(width+length); }
    public int getSurface() { return width*length; }

    public void setBoundingBox(int heightBB, int widthBB) {
        width = widthBB;
        length = heightBB;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color c) {
        super.setColor(c);
    }

    @Override
    public Point getOrigin() {
        return super.getOrigin();
    }

    @Override
    public void setOrigin() {
        super.setOrigin(origin);
    }

    public String toString() {
        return "Longueur = " + this.width +
                " Largeur = " + this.length +
                " Couleur : " + this.c;
    }

    public static void main(String[] args) {
        Rectangle Rectangle_1 = new Rectangle();
        System.out.println(Rectangle_1);
        Color c_2 = new Color(255,255,0);
        Rectangle Rectangle_2 = new Rectangle(c_2);
        System.out.println(Rectangle_2);
        Color c_3 = new Color(0,0,255);
        Rectangle Rectangle_3 = new Rectangle(20,20,c_3);
        System.out.println(Rectangle_3);
    }
}
