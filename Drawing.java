package fr.ensea.Project2A.PaintProject;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.util.ArrayList;


public class Drawing extends JPanel implements MouseMotionListener, MouseListener {
    protected Color currentColor;
    protected String nameFigure;
    ArrayList<Figure> figures = new ArrayList<Figure>(4);
    protected int x;
    protected int y;

    public Drawing(){
        super();
        this.setBackground(Color.WHITE);
        nameFigure = null;
        x=0;
        y=0;
        currentColor = Color.WHITE;
    }


    public void setCurrentColor(Color currentColor) { this.currentColor = currentColor; }
    public ArrayList<Figure> getFigures() {
        return figures;
    }
    public void setList(ArrayList<Figure> figures) {
        this.figures = figures;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
    //public void paintComponent()
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}