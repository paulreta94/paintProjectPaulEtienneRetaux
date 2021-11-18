package fr.ensea.Project2A.PaintProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


public class Window extends JFrame implements ActionListener {
    private final Drawing drawPanel = new Drawing();

    // Définition de la fenêtre d'affichage
    protected Window(String Title, int x, int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();

        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("A propos");

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
        menu1.add(newFile);
        menu1.add(open);
        menu1.add(save);
        menu1.add(quit);

        JOptionPane info = new JOptionPane();
        info.showInternalMessageDialog(info,"Author : Paul-Etienne Rétaux","Paint Octobre - novembre 2021",JOptionPane.INFORMATION_MESSAGE);
        menu2.add(info);

        m.add(menu1);
        m.add(menu2);

        JButton Black = new JButton("BLack");
        JButton Yellow = new JButton("Yellow");
        JButton Red = new JButton("Red");
        JButton Pink = new JButton("Pink");
        JButton Green = new JButton("Green");
        JButton Purple = new JButton("Magenta");
        JButton Blue = new JButton("Blue");
        JButton Orange = new JButton("Orange");
        JButton Ellipse = new JButton("Ellipse");
        JButton Rectangle = new JButton("Rectangle");
        JButton Circle = new JButton("Circle");
        JButton Square = new JButton("Square");

        contentPanel.add(Black);
        Black.setBackground(Color.black);
        Black.setForeground(Color.white);
        contentPanel.add(Yellow);
        contentPanel.add(Red);
        contentPanel.add(Pink);
        contentPanel.add(Green);
        contentPanel.add(Purple);
        contentPanel.add(Blue);
        contentPanel.add(Orange);
        contentPanel.add(Ellipse);
        contentPanel.add(Rectangle);
        contentPanel.add(Circle);
        contentPanel.add(Square);

        Black.addActionListener((ActionListener) this);
        Yellow.addActionListener((ActionListener) this);
        Red.addActionListener((ActionListener) this);
        Pink.addActionListener((ActionListener) this);
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
        /////////////////////////////////
        this.setVisible(true);
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
        }
    }


}
