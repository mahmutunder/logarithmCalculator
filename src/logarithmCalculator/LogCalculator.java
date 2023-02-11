package logarithmCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogCalculator extends JFrame implements ActionListener {
    private JTextField numberField;
    private JTextField baseField;
    private JLabel result;
    private JButton calculateButton;


    public LogCalculator() {
        // set title
        setTitle("Logarithm Calculator");
        // to end program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // grid layout to set up
        setLayout(new GridLayout(0, 2));

        // add label to frame
        add(new JLabel("Number:"));
        // number field
        numberField = new JTextField(10);
        // add frame
        add(numberField);

        // base label to add frame
        add(new JLabel("Base:"));
        // base input box
        baseField = new JTextField(10);
        // add frame
        add(baseField);


        // instantiate calculate button
         calculateButton = new JButton("Calculate");
         // add action when click
        calculateButton.addActionListener(this);
        // add the frame
        add(calculateButton);

        // instantiate result label to show result
        result=new JLabel("Result:");

        // add the frame
        add(result);


        // set size of frame
        setSize(400,200);

        // to show frame
        setVisible(true);
    }

    // actionPerformed method override
    @Override
    public void actionPerformed(ActionEvent e) {
        double resultLog=0.0;
        try {


            // get number text and convert to double
            double number = Double.parseDouble(numberField.getText());
            // get base text and convert to double
            double base = Double.parseDouble(baseField.getText());
            //  calculate log
             resultLog = Math.log(number) / Math.log(base);
        }catch (RuntimeException ex){
            JOptionPane.showMessageDialog(null,"Only number please!!");
        }
        result.setText("Result: "+(resultLog));

    }

    // main method to run code
    public static void main(String[] args) {
        new LogCalculator();
    }
}
