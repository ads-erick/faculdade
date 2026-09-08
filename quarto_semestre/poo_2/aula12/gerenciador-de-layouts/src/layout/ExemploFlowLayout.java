package layout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ExemploFlowLayout extends JFrame {

    public ExemploFlowLayout(){
        setTitle("FlowLayout");
        setSize(800,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){
        JPanel root = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
        root.setBorder(criarBorda());

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                var manager = (FlowLayout) root.getLayout();
                manager.setAlignment(comboBox.getSelectedIndex());
                SwingUtilities.updateComponentTreeUI(root);
            }
        });


        comboBox.addItem("LEFT");
        comboBox.addItem("CENTER");
        comboBox.addItem("RIGHT");
        comboBox.addItem("LEADING");
        comboBox.addItem("TRAILING");


        JTextField tfHgap = new JTextField(4);
        tfHgap.setText("10");
        JTextField tfVgap = new JTextField(4);
        tfVgap.setText("10");
        JButton b1 = new JButton("ATUALIZAR TELA");
        b1.addActionListener(e ->{
            var manager = (FlowLayout) root.getLayout();
            try{
                manager.setVgap(Integer.parseInt(tfVgap.getText()));
                manager.setHgap(Integer.parseInt(tfHgap.getText()));
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            SwingUtilities.updateComponentTreeUI(root);
        });
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");
        JButton b4 = new JButton("Botão 4");
        JLabel label = new JLabel("O layout é orientado da esquerda, centro ou à direita.");

        root.add(new JLabel("Orientação: "));
        root.add(comboBox);
        root.add(new JLabel("HGap: "));
        root.add(tfHgap);
        root.add(new JLabel("VGap: "));
        root.add(tfVgap);
        root.add(b1);
        root.add(b2);
        root.add(b3);
        root.add(b4);
        root.add(label);

        add(root);
    }

    public Border criarBorda(){
        int margem = 20;
        return BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(margem,margem,margem,margem),BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"FlowLayout"));
    }



}
