package layout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ExemploBorderLayout extends JFrame {

    public ExemploBorderLayout(){
        setTitle("BorderLayout");
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){
        JPanel root = new JPanel(new BorderLayout());
        //root.setBorder(criarBorda());

        JPanel center = new JPanel();
        center.setBackground(Color.YELLOW);
        center.setPreferredSize(new Dimension(400,400));
        center.add(new JLabel("CENTER"));


        JPanel north = new JPanel();
        north.setBackground(Color.BLACK);
        north.setPreferredSize(new Dimension(400,100));
        JLabel l1 = new JLabel("NORTH");
        l1.setForeground(Color.WHITE);
        north.add(l1);

        JPanel south = new JPanel();
        south.setBackground(Color.RED);
        south.setPreferredSize(new Dimension(400,100));
        south.add(new JLabel("SOUTH"));

        JPanel west = new JPanel();
        west.setBackground(Color.BLUE);
        west.setPreferredSize(new Dimension(100,400));
        JLabel l2 = new JLabel("BLUE");
        l2.setForeground(Color.WHITE);
        west.add(l2);

        JPanel east = new JPanel();
        east.setBackground(Color.GREEN);
        east.setPreferredSize(new Dimension(100,400));
        east.add(new JLabel("EAST"));


        root.add(north,BorderLayout.NORTH);
        root.add(center,BorderLayout.CENTER);
        root.add(south,BorderLayout.SOUTH);
        root.add(east,BorderLayout.EAST);
        root.add(west,BorderLayout.WEST);

        add(root);
    }

    public Border criarBorda(){
        int margem = 20;
        return BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(margem,margem,margem,margem),BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"BorderLayout"));
    }



}
