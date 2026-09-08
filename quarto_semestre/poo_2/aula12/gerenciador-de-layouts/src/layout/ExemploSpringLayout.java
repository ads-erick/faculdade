package layout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ExemploSpringLayout extends JFrame {

    public ExemploSpringLayout(){
        setTitle("SpringLayout");
        setSize(310,270);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){
        JPanel root = new JPanel();
        // rows ou cols deve ser zero
        SpringLayout layout = new SpringLayout();
        root.setLayout(layout);
        root.setBorder(criarBorda());


        JLabel l1 = new JLabel("Nome:",SwingConstants.TRAILING);
        l1.setPreferredSize(new Dimension(100,25));
        JLabel l2 = new JLabel("Telefone:",SwingConstants.TRAILING);
        l2.setPreferredSize(new Dimension(100,25));
        JLabel l3 = new JLabel("Email:",SwingConstants.TRAILING);
        l3.setPreferredSize(new Dimension(100,25));
        JLabel l4 = new JLabel("Endereço.",SwingConstants.TRAILING);
        l4.setPreferredSize(new Dimension(100,25));

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(10);

        JButton b1 = new JButton("Salvar");

        root.add(l1);
        root.add(t1);
        root.add(l2);
        root.add(t2);
        root.add(l3);
        root.add(t3);
        root.add(l4);
        root.add(t4);
        root.add(b1);

        // coordenadas dos componentes.
        // posição do componente x, orientação relativa ao componente y
        // WEST de l1, fica a WEST do root
        // NORTH do l1, fica no NORTH do root

        layout.putConstraint(SpringLayout.WEST,l1,6,SpringLayout.WEST,root);
        layout.putConstraint(SpringLayout.NORTH,l1,6,SpringLayout.NORTH,root);


        layout.putConstraint(SpringLayout.WEST,l2,6,SpringLayout.WEST,root);
        layout.putConstraint(SpringLayout.NORTH,l2,6,SpringLayout.SOUTH,l1);

        layout.putConstraint(SpringLayout.WEST,l3,6,SpringLayout.WEST,root);
        layout.putConstraint(SpringLayout.NORTH,l3,6,SpringLayout.SOUTH,l2);

        layout.putConstraint(SpringLayout.WEST,l4,6,SpringLayout.WEST,root);
        layout.putConstraint(SpringLayout.NORTH,l4,6,SpringLayout.SOUTH,l3);


        layout.putConstraint(SpringLayout.WEST,t1,5,SpringLayout.EAST,l1);
        layout.putConstraint(SpringLayout.NORTH,t1,5,SpringLayout.NORTH,root);

        layout.putConstraint(SpringLayout.WEST,t2,6,SpringLayout.EAST,l2);
        layout.putConstraint(SpringLayout.NORTH,t2,6,SpringLayout.SOUTH,t1);

        layout.putConstraint(SpringLayout.WEST,t3,6,SpringLayout.EAST,l3);
        layout.putConstraint(SpringLayout.NORTH,t3,6,SpringLayout.SOUTH,t2);

        layout.putConstraint(SpringLayout.WEST,t4,6,SpringLayout.EAST,l4);
        layout.putConstraint(SpringLayout.NORTH,t4,6,SpringLayout.SOUTH,t3);

        layout.putConstraint(SpringLayout.EAST,b1,6,SpringLayout.EAST,t4);
        layout.putConstraint(SpringLayout.NORTH,b1,6,SpringLayout.SOUTH,t4);

        add(root);
    }

    public Border criarBorda(){
        int margem = 20;
        return BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(margem,margem,margem,margem),BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"SpringLayout"));
    }



}
