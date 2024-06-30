package com.workouts.collection;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField display;
    private JPanel panel;
    private String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", ".", "=", "+"
    };
    private JButton[] buttonArray = new JButton[buttons.length];
    private String operator = "";
    private double num1, num2, result;

    public Calculator() {
        // Frame settings
        setTitle("Calculator");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        add(panel);

        // Initialize buttons and add to panel
        for (int i = 0; i < buttons.length; i++) {
            buttonArray[i] = new JButton(buttons[i]);
            buttonArray[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttonArray[i].addActionListener(this);
            panel.add(buttonArray[i]);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If command is a number or decimal point, add to display
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.charAt(0) == '.') {
            display.setText(display.getText() + command);
        }
        // If command is an operator
        else if (command.charAt(0) == 'C') {
            display.setText("");
        }
        else if (command.charAt(0) == '=') {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
            operator = "";
        }
        else {
            if (!display.getText().equals("")) {
                num1 = Double.parseDouble(display.getText());
                operator = command;
                display.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
