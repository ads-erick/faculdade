package layout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ExemploBoxLayout extends JFrame {

    public ExemploBoxLayout(){
        setTitle("BoxLayout");
        setSize(800,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){
        JPanel root = new JPanel();
        root.setLayout(new BoxLayout(root,BoxLayout.LINE_AXIS));
        root.setBorder(criarBorda());

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                var manager = (BoxLayout) root.getLayout();
                //manager.(comboBox.getSelectedIndex());
                root.setLayout(new BoxLayout(root,comboBox.getSelectedIndex()));
                SwingUtilities.updateComponentTreeUI(root);
            }
        });


        comboBox.addItem("X_AXIS");
        comboBox.addItem("Y_AXIS");

        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");
        JButton b4 = new JButton("Botão 4");
        JLabel label = new JLabel("O layout é orientado em linha ou coluna.");

        root.add(new JLabel("Orientação: "));
        root.add(comboBox);
        root.add(b2);
        root.add(b3);
        root.add(b4);
        root.add(label);

        add(root);
    }

    public Border criarBorda(){
        int margem = 20;
        return BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(margem,margem,margem,margem),BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"BoxLayout"));
    }



}
