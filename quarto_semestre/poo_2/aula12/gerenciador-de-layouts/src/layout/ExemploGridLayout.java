package layout;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ExemploGridLayout extends JFrame {

    public ExemploGridLayout(){
        setTitle("GridLayout");
        setSize(800,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){
        JPanel root = new JPanel();
        // rows ou cols deve ser zero
        root.setLayout(new GridLayout(0,2));
        root.setBorder(criarBorda());

        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");
        JButton b4 = new JButton("Botão 4");
        JLabel label = new JLabel("O layout é orientado em GRID.");
        JTextField tfRows = new JTextField(4);
        tfRows.setText("4");
        JTextField tfCols = new JTextField(4);
        tfCols.setText("2");
        JButton b1 = new JButton("ATUALIZAR TELA");
        b1.addActionListener(e ->{
            var manager = (GridLayout) root.getLayout();
            try{
                manager.setColumns(Integer.parseInt(tfCols.getText()));
                manager.setRows(Integer.parseInt(tfRows.getText()));
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            SwingUtilities.updateComponentTreeUI(root);
        });

        root.add(b1);
        root.add(b2);
        root.add(b3);
        root.add(b4);
        root.add(new JLabel("Rows: "));
        root.add(tfRows);
        root.add(new JLabel("Cols: "));
        root.add(tfCols);
        root.add(label);


        add(root);
    }

    public Border criarBorda(){
        int margem = 20;
        return BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(margem,margem,margem,margem),BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"GridLayout"));
    }



}
