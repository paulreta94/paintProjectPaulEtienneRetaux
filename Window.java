package fr.ensea.Project2A.PaintProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;


public class Window extends JFrame implements ActionListener {
    private final Drawing drawPanel = new Drawing();
    protected ArrayList<Figure> figures = drawPanel.getFigures();
    // Définition de la fenêtre d'affichage
    public Window(String Title, int x, int y)
    {
        this.setTitle(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();

        // menus
        JMenuBar m = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("A propos");

        JMenuItem newFile = new JMenuItem("New");
        newFile.addActionListener(this);
        menu1.add(newFile);
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(this);
        menu1.add(open);
        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(this);
        menu1.add(save);
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);
        menu1.add(quit);




        JOptionPane info = new JOptionPane();
        info.showInternalMessageDialog(info,"Author : Paul-Etienne Rétaux","Paint Octobre - novembre 2021",JOptionPane.INFORMATION_MESSAGE);
        menu2.add(info);

        m.add(menu1);
        m.add(menu2);

        JButton Black = new JButton("BLack");
        Black.setBackground(Color.black);
        Black.setForeground(Color.white);
        contentPanel.add(Black);

        JButton Yellow = new JButton("Yellow");
        contentPanel.add(Yellow);

        JButton Red = new JButton("Red");
        contentPanel.add(Red);

        JButton Pink = new JButton("Pink");
        contentPanel.add(Pink);

        JButton Green = new JButton("Green");
        contentPanel.add(Green);

        JButton Purple = new JButton("Magenta");
        contentPanel.add(Purple);

        JButton Blue = new JButton("Blue");
        contentPanel.add(Blue);

        JButton Orange = new JButton("Orange");
        contentPanel.add(Orange);

        JButton Ellipse = new JButton("Ellipse");
        contentPanel.add(Ellipse);

        JButton Rectangle = new JButton("Rectangle");
        contentPanel.add(Rectangle);

        JButton Circle = new JButton("Circle");
        contentPanel.add(Circle);

        JButton Square = new JButton("Square");
        contentPanel.add(Square);

        Black.addActionListener(this);
        Yellow.addActionListener(this);
        Red.addActionListener(this);
        Pink.addActionListener( this);
        Green.addActionListener((ActionListener) this);
        Purple.addActionListener((ActionListener) this);
        Blue.addActionListener((ActionListener) this);
        Orange.addActionListener((ActionListener) this);
        Ellipse.addActionListener((ActionListener) this);
        Rectangle.addActionListener((ActionListener) this);
        Circle.addActionListener((ActionListener) this);
        Square.addActionListener((ActionListener) this);




        //////////////////////////////////////////
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,6));
        southPanel.add(Black);
        southPanel.add(Yellow);
        southPanel.add(Red);
        southPanel.add(Pink);
        southPanel.add(Green);
        southPanel.add(Purple);
        southPanel.add(Blue);
        southPanel.add(Orange);
        southPanel.add(Ellipse);
        southPanel.add(Rectangle);
        southPanel.add(Circle);
        southPanel.add(Square);
        contentPanel.add(southPanel,"South");
        contentPanel.add(m,"North");
        contentPanel.add(drawPanel);
        this.setJMenuBar(m);
        this.setVisible(true);

    }

    public void saveDrawing(){
        try{
            FileOutputStream fos = new FileOutputStream("sauveDessin.jpeg");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(figures.size());
            for(Figure f:figures){
                oos.writeObject(f);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String args[]){
        Window win = new Window("Paint",800,600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch(cmd) {
            case "BLack":
                drawPanel.setCurrentColor(Color.BLACK);
                break;
            case "Yellow":
                drawPanel.setCurrentColor(Color.YELLOW);
                break;
            case "Red":
                drawPanel.setCurrentColor(Color.RED);
                break;
            case "Pink":
                drawPanel.setCurrentColor(Color.PINK);
                break;
            case "Green":
                drawPanel.setCurrentColor(Color.GREEN);
                break;
            case "Magenta":
                drawPanel.setCurrentColor(Color.MAGENTA);
                break;
            case "Blue":
                drawPanel.setCurrentColor(Color.BLUE);
                break;
            case "Orange":
                drawPanel.setCurrentColor(Color.ORANGE);
                break;
            case "Ellipse":
                drawPanel.setNameFigure("Ellipse");
                break;
            case "Rectangle":
                drawPanel.setNameFigure("Rectangle");
                break;
            case "Circle":
                drawPanel.setNameFigure("Circle");
                break;
            case "Square":
                drawPanel.setNameFigure("Square");
                break;
            case "New":
                drawPanel.setFigures(new ArrayList<Figure>());
                break;
            case "Quit":
                System.exit(0);
                break;
            case "Save":
                saveDrawing();
                break;
        }
    }


}
