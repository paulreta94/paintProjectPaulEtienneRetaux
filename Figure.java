package fr.ensea.Project2A.PaintProject;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Figure implements Serializable {
        protected int heightBB;
        protected int widthBB;
        protected Point origin;
        protected Color c;

        public abstract void draw (Graphics g);
        public abstract void setBoundingBox (int heightBB, int widthBB);

        public Figure(Color color, Point point) {
            c=color;
            origin = point;
        }

        public Figure() {
            this(new Color(0,0,0), new Point(0,0));
        }

        public Point getOrigin() { return origin; }
        public Color getColor() { return c; }
        public int getSurface() { return heightBB*widthBB; }
        public int getPerimeter() { return 2*(heightBB + widthBB); }

        @Override
        public String toString() {
            return "Origine :" + this.origin +
                    "Couleur :" + this.c;
        }

        public static void main(String[] args) {}
    }

