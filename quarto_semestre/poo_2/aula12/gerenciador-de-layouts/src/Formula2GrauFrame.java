import javax.swing.*;

public class Formula2GrauFrame extends JFrame {

    public Formula2GrauFrame(){
        setSize(150,300);
        setResizable(false);
        setTitle("Fórmula do 2 Grau");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){

        JTextField tfA = new JTextField(8);
        JTextField tfB = new JTextField(8);
        JTextField tfC = new JTextField(8);
        JLabel lbX1 = new JLabel("x1 = ");
        JLabel lbX2 = new JLabel("x2 = ");
        JButton btCalcular = new JButton("Calcular");

        JPanel panel =new JPanel();

        panel.add(new JLabel("     ax^2 + bx + c               "));
        panel.add(new JLabel("A: "));
        panel.add(tfA);
        panel.add(new JLabel("B: "));
        panel.add(tfB);
        panel.add(new JLabel("C: "));
        panel.add(tfC);
        panel.add(btCalcular);
        panel.add(new JLabel("    Resultado                    "));
        panel.add(lbX1);
        panel.add(lbX2);


        add(panel);

    }

}
