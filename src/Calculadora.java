import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    public JPanel panelMain;
    private JTextField textValor1;
    private JTextField textValor2;
    private JButton CEButton;
    private JButton buttonSomar;
    private JButton buttonSubtrair;
    private JButton buttonDividir;
    private JButton buttonMultiplicar;
    private JTextField textResultado;

    public void limparCampos(){
        textValor1.setText("");
        textValor2.setText("");
        textResultado.setText("");
    }
    public Calculadora() {
        buttonSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Double resultado =  Double.valueOf(textValor1.getText()) + Double.valueOf(textValor2.getText());
                textResultado.setText(resultado.toString());
            }
        });
        buttonSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resultado =  Double.valueOf(textValor1.getText()) - Double.valueOf(textValor2.getText());
                textResultado.setText(resultado.toString());
            }
        });
        buttonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resultado =  Double.valueOf(textValor1.getText()) / Double.valueOf(textValor2.getText());
                textResultado.setText(resultado.toString());
            }
        });
        buttonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double resultado =  Double.valueOf(textValor1.getText()) * Double.valueOf(textValor2.getText());
                textResultado.setText(resultado.toString());
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
    }
}
