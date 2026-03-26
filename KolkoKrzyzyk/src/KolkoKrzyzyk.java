import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KolkoKrzyzyk {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel KolkoKrzyzyk;

    private String znak = "X";

    public KolkoKrzyzyk() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button1.getText().isEmpty()){
                    button1.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button2.getText().isEmpty()){
                    button2.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button3.getText().isEmpty()){
                    button3.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button4.getText().isEmpty()){
                    button4.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button5.getText().isEmpty()){
                    button5.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button6.getText().isEmpty()){
                    button6.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button7.getText().isEmpty()){
                    button7.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button8.getText().isEmpty()){
                    button8.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button9.getText().isEmpty()){
                    button9.setText(znak);
                    sprawdz();
                    zmienGracza();
                }
            }
        });
    }

    public void zmienGracza(){
        if (znak.equals("X")){
            znak = "O";
        } else {
            znak = "X";
        }
    }

    public void sprawdz() {
        if (
                button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText()) && !button1.getText().isEmpty() ||
                        button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText()) && !button4.getText().isEmpty() ||
                        button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText()) && !button7.getText().isEmpty() ||

                        button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText()) && !button1.getText().isEmpty() ||
                        button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText()) && !button2.getText().isEmpty() ||
                        button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText()) && !button3.getText().isEmpty() ||

                        button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText()) && !button1.getText().isEmpty() ||
                        button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText()) && !button3.getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null, "Wygrywa: " + znak);
        }
        else if (
                !button1.getText().isEmpty() &&
                        !button2.getText().isEmpty() &&
                        !button3.getText().isEmpty() &&
                        !button4.getText().isEmpty() &&
                        !button5.getText().isEmpty() &&
                        !button6.getText().isEmpty() &&
                        !button7.getText().isEmpty() &&
                        !button8.getText().isEmpty() &&
                        !button9.getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null, "Remis!");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KolkoKrzyzyk");
        frame.setContentPane(new KolkoKrzyzyk().KolkoKrzyzyk);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}