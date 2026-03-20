import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trojmian {
    private JPanel Trojmian;
    private JTextField A;
    private JTextField B;
    private JTextField C;
    private JButton rozwiazButton;
    private JLabel wynik;
    private JLabel solution;

    public Trojmian() {
        rozwiazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(A.getText());
                    double b = Double.parseDouble(B.getText());
                    double c = Double.parseDouble(C.getText());

                    if (a == 0) {
                        solution.setText("To nie jest trójmian (a=0)");
                        return;
                    }

                    double delta = b * b - 4 * a * c;

                    if (delta < 0) {
                        solution.setText("Brak rozwiązań");
                    }
                    else if (delta == 0) {
                        double x = -b / (2 * a);
                        solution.setText("Jedno rozwiązanie: x = " + x);
                    }
                    else {
                        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                        solution.setText("Dwa rozwiązania: x1 = " + x1 + ", x2 = " + x2);
                    }

                } catch (NumberFormatException ex) {
                    solution.setText("Błędne dane!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Trojmian");
        frame.setContentPane(new Trojmian().Trojmian);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}