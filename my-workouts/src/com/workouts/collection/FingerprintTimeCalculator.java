package com.workouts.collection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FingerprintTimeCalculator extends JFrame {

    private final SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a"); // Format for displaying time and parsing user input
    private final ArrayList<Date> times = new ArrayList<>(); // Stores all recorded times (in/out)
    private final JTextArea inputArea; // Text area for pasting time data
    private final JLabel outputLabel; // Label to display results

    public FingerprintTimeCalculator() {
        super("Fingerprint Time Calculator (Text Input)");
        setLayout(new GridLayout(3, 1, 5, 5)); // Set grid layout

        // Text area
        inputArea = new JTextArea(5, 20);
        inputArea.setBorder(BorderFactory.createTitledBorder("Paste Time Data (IN/OUT):"));

        // Calculate button
        JButton calculateButton = new JButton("Calculate Hours");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalHours();
            }
        });

        // Output label
        outputLabel = new JLabel("...");
        outputLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components
        add(inputArea);
        add(calculateButton);
        add(outputLabel);

        setSize(400, 200); // Set window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Make the window visible
    }

    private void calculateTotalHours() {
        String[] timeEntries = inputArea.getText().split("\n");
        times.clear(); // Clear previous data

        for (String entry : timeEntries) {
            try {
                Date time = timeFormat.parse(entry.trim());
                times.add(time);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Invalid time format: " + entry, "Error", JOptionPane.ERROR_MESSAGE);
                return; // Stop processing on error
            }
        }

        double totalHours = 0.0;
        boolean hasIn = false; // Track if there's an in time recorded

        for (int i = 0; i < times.size(); i++) {
            totalHours += calculateTimeDifference(times.get(i), hasIn);
            hasIn = !hasIn; // Toggle in/out flag
        }

        // Check for incomplete data (odd number of entries)
        if (times.size() % 2 != 0) {
            outputLabel.setText("Incomplete data! Missing clock-out for last entry.");
            return;
        }

        String output = "Total Hours: " + String.format("%.2f", totalHours);

        // Check if 8 hours are completed
        if (totalHours >= 8.0) {
            output += "\n You can leave the office now.";
        } else {
            output += "\n You need to work for an additional " + String.format("%.2f", 8.0 - totalHours) + " hours to complete 8 hours.";
        }

        outputLabel.setText(output);
    }

    private double calculateTimeDifference(Date time, boolean hasIn) {
        if (times.isEmpty()) {
            return 0.0; // First entry (no difference)
        }

        Date previousTime = times.get(times.size() - 1);
        long diffInMs = time.getTime() - previousTime.getTime();
        return (diffInMs / (1000.0 * 60.0 * 60.0)); // Convert milliseconds to hours
    }

    public static void main(String[] args) {
        new FingerprintTimeCalculator();
    }
}
