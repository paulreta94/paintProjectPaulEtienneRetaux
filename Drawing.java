package fr.ensea.Project2A.PaintProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.util.ArrayList;


public class Drawing extends JPanel implements MouseMotionListener, MouseListener, Serializable {
    protected Color currentColor;
    protected String nameFigure;
    protected ArrayList<Figure> figures;
    protected int x;
    protected int y;
    protected int heightBB;
    protected int widthBB;
    protected Point MouseEvent1;
    protected Point MouseEvent2;
    Figure figure;

    public Drawing(){
        super();
        this.setBackground(Color.WHITE);
        figures = new ArrayList<Figure>();
        nameFigure = null;
        x=0;
        y=0;
        currentColor = Color.WHITE;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        MouseEvent1 = new Point(e.getX(),e.getY());
        switch(nameFigure) {
            case "Rectangle":
                figure = new Rectangle(MouseEvent1.getX(), MouseEvent1.getY(),currentColor);
                figures.add(figure);
                break;
            case "Square":
                figure = new Square(MouseEvent1.getX(), MouseEvent1.getY(),currentColor);
                figures.add(figure);
                break;
            case "Ellipse":
                figure = new Ellipse(MouseEvent1.getX(),MouseEvent1.getY(),currentColor);
                figures.add(figure);
                break;
            case "Circle":
                figure = new Circle(MouseEvent1.getX(),MouseEvent1.getY(),currentColor);
                figures.add(figure);
                break;
        }
        repaint();
    }

    public void setCurrentColor(Color currentColor) { this.currentColor = currentColor; }
    public ArrayList<Figure> getFigures() {
        return figures;
    }
    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
    //public void paintComponent()
    @Override
    public void mouseDragged(MouseEvent e) {
        MouseEvent2 = new Point(e.getX(),e.getY());
        heightBB = Math.abs(MouseEvent1.getY()-MouseEvent2.getY());
        widthBB = Math.abs(MouseEvent1.getX()-MouseEvent2.getX());
        figure.setBoundingBox(heightBB,widthBB);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        MouseEvent2.setX(e.getX());
        MouseEvent2.setY(e.getY());
        heightBB = Math.abs(MouseEvent1.getY()-MouseEvent2.getY());
        widthBB = Math.abs(MouseEvent1.getX()-MouseEvent2.getX());
        figure.setBoundingBox(heightBB,widthBB);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        for (Figure f:figures){
            f.draw(g);
            this.repaint();
        }
    }
}