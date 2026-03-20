import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {
    private JPanel kalkulator;
    private JTextField liczba1;
    private JComboBox<String> operacja;
    private JTextField liczba2;
    private JButton oblicz;
    private JLabel wynik;

    public Kalkulator() {
        oblicz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double l1 = Double.parseDouble(liczba1.getText());
                    double l2 = Double.parseDouble(liczba2.getText());
                    double w1 = 0;
                    int op = operacja.getSelectedIndex();

                    switch (op) {
                        case 0:
                            w1 = l1 + l2;
                            break;
                        case 1:
                            w1 = l1 - l2;
                            break;
                        case 2:
                            w1 = l1 * l2;
                            break;
                        case 3:
                            if (l2 == 0) {
                                wynik.setText("Nie dziel przez 0!");
                                return;
                            }
                            w1 = l1 / l2;
                            break;
                    }

                    wynik.setText(String.valueOf(w1));

                } catch (NumberFormatException ex) {
                    wynik.setText("Błędne dane!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().kalkulator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}