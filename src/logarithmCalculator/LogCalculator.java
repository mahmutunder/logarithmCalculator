package logarithmCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogCalculator extends JFrame implements ActionListener {
    private JTextField numberField;
    private JTextField baseField;
    private JLabel result;


    public LogCalculator() {
        setTitle("Logarithm Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));

        add(new JLabel("Number:"));
        numberField = new JTextField(10);
        add(numberField);

        add(new JLabel("Base:"));
        baseField = new JTextField(10);
        add(baseField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        result=new JLabel("Result:");

        add(result);


        setSize(400,200);
        //pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double number = Double.parseDouble(numberField.getText());
        double base = Double.parseDouble(baseField.getText());
        double resultLog = Math.log(number) / Math.log(base);
        result.setText("Result: "+String.valueOf(resultLog));

    }

    public static void main(String[] args) {
        new LogCalculator();
    }
}
