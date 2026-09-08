import javax.swing.*;

public class ConversorTemperaturaFrame extends JFrame {

    public ConversorTemperaturaFrame(){
        setSize(300,150);
        setResizable(false);
        setTitle("Conversor Celsius para Fahrenheit");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout();
    }

    private void setLayout(){
        JTextField tfCelsius = new JTextField(3);
        JLabel lbResultado = new JLabel("100F");
        JButton btCalcular = new JButton("Calcular");
        btCalcular.addActionListener( e -> {
            try{
                double c = Double.parseDouble(tfCelsius.getText());
                double f = (c * 9/5) +32.0;
                lbResultado.setText(Double.toString(f)+" F");
            }catch (Exception exp){
                tfCelsius.setText("");
            }
        });

        JPanel panel =new JPanel();

        panel.add(new JLabel("Temp. Celsius"));
        panel.add(tfCelsius);
        panel.add(btCalcular);
        panel.add(lbResultado);

        add(panel);
    }

}
