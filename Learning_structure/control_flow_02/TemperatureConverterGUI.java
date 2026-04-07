package control_flow_02;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TemperatureConverterGUI {

    private JFrame frame;
    private JTextField temperatureField;
    private JComboBox<String> fromUnitCombo;
    private JComboBox<String> toUnitCombo;
    private JLabel resultLabel;
    private JLabel contextLabel;
    private JButton convertButton;
    private JButton swapButton;
    private JButton clearButton;

    private final DecimalFormat df = new DecimalFormat("0.00");

    // Supported temperature units
    private final String[] UNITS = {"Celsius (°C)", "Fahrenheit (°F)", "Kelvin (K)"};

    public static void main(String[] args) {
        // Run GUI on Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new TemperatureConverterGUI().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Create main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(240, 248, 255)); // AliceBlue

        // Add components
        mainPanel.add(createInputPanel(), BorderLayout.NORTH);
        mainPanel.add(createButtonPanel(), BorderLayout.CENTER);
        mainPanel.add(createResultPanel(), BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }

    private JPanel createInputPanel() {
        JPanel inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBackground(new Color(240, 248, 255));
        inputPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
                "Temperature Conversion",
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                new Color(70, 130, 180)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Temperature label and field
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel tempLabel = new JLabel("Temperature:");
        tempLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        inputPanel.add(tempLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        temperatureField = new JTextField(10);
        temperatureField.setFont(new Font("Arial", Font.PLAIN, 14));
        temperatureField.addActionListener(e -> performConversion());
        inputPanel.add(temperatureField, gbc);

        // From unit
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel fromLabel = new JLabel("Convert from:");
        fromLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        inputPanel.add(fromLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        fromUnitCombo = new JComboBox<>(UNITS);
        fromUnitCombo.setFont(new Font("Arial", Font.PLAIN, 14));
        fromUnitCombo.setPreferredSize(new Dimension(150, 30));
        inputPanel.add(fromUnitCombo, gbc);

        // To unit
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel toLabel = new JLabel("Convert to:");
        toLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        inputPanel.add(toLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        toUnitCombo = new JComboBox<>(UNITS);
        toUnitCombo.setFont(new Font("Arial", Font.PLAIN, 14));
        toUnitCombo.setPreferredSize(new Dimension(150, 30));
        toUnitCombo.setSelectedIndex(1); // Default to Fahrenheit
        inputPanel.add(toUnitCombo, gbc);

        return inputPanel;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(new Color(240, 248, 255));

        convertButton = createStyledButton("Convert", new Color(70, 130, 180));
        convertButton.addActionListener(e -> performConversion());

        swapButton = createStyledButton("Swap Units", new Color(100, 149, 237));
        swapButton.addActionListener(e -> swapUnits());

        clearButton = createStyledButton("Clear", new Color(220, 20, 60));
        clearButton.addActionListener(e -> clearAll());

        buttonPanel.add(convertButton);
        buttonPanel.add(swapButton);
        buttonPanel.add(clearButton);

        return buttonPanel;
    }

    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(120, 35));

        // Hover effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(bgColor.darker());
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(bgColor);
            }
        });

        return button;
    }

    private JPanel createResultPanel() {
        JPanel resultPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        resultPanel.setBackground(new Color(240, 248, 255));
        resultPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(70, 130, 180), 1),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        resultLabel = new JLabel("Ready for conversion", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        resultLabel.setForeground(new Color(70, 130, 180));

        contextLabel = new JLabel(" ", SwingConstants.CENTER);
        contextLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        contextLabel.setForeground(Color.GRAY);

        resultPanel.add(resultLabel);
        resultPanel.add(contextLabel);

        return resultPanel;
    }

    private void performConversion() {
        String inputText = temperatureField.getText().trim();

        // Validate input
        if (inputText.isEmpty()) {
            showError("Please enter a temperature value.");
            return;
        }

        double inputTemp;
        try {
            inputTemp = Double.parseDouble(inputText);
        } catch (NumberFormatException e) {
            showError("Invalid temperature! Please enter a valid number.");
            return;
        }

        String fromUnit = (String) fromUnitCombo.getSelectedItem();
        String toUnit = (String) toUnitCombo.getSelectedItem();

        // Check for absolute zero
        if (isBelowAbsoluteZero(inputTemp, fromUnit)) {
            showError("Temperature cannot be below Absolute Zero (-273.15°C, -459.67°F, 0K)!");
            return;
        }

        // Perform conversion
        double celsius = convertToCelsius(inputTemp, fromUnit);
        double result = convertFromCelsius(celsius, toUnit);

        // Display result
        String fromSymbol = getUnitSymbol(fromUnit);
        String toSymbol = getUnitSymbol(toUnit);

        resultLabel.setText(String.format("%.2f%s = %.2f%s",
                inputTemp, fromSymbol, result, toSymbol));

        // Add context information
        updateContextInfo(result, toUnit);
    }

    private double convertToCelsius(double temp, String fromUnit) {
        if (fromUnit.contains("Celsius")) {
            return temp;
        } else if (fromUnit.contains("Fahrenheit")) {
            return (temp - 32) * 5 / 9;
        } else { // Kelvin
            return temp - 273.15;
        }
    }

    private double convertFromCelsius(double celsius, String toUnit) {
        if (toUnit.contains("Celsius")) {
            return celsius;
        } else if (toUnit.contains("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else { // Kelvin
            return celsius + 273.15;
        }
    }

    private String getUnitSymbol(String unit) {
        if (unit.contains("Celsius")) return "°C";
        if (unit.contains("Fahrenheit")) return "°F";
        return "K";
    }

    private boolean isBelowAbsoluteZero(double temp, String unit) {
        if (unit.contains("Celsius")) return temp < -273.15;
        if (unit.contains("Fahrenheit")) return temp < -459.67;
        return temp < 0; // Kelvin
    }

    private void updateContextInfo(double temp, String unit) {
        String context = "";

        if (unit.contains("Celsius")) {
            if (temp <= -40) context = "⚠️ Extremely cold! Dangerous exposure risk.";
            else if (temp <= -10) context = "❄️ Extremely cold! Bundle up heavily.";
            else if (temp <= 0) context = "❄️ Freezing point of water.";
            else if (temp <= 10) context = "🧥 Very cold. Wear warm clothing.";
            else if (temp <= 20) context = "🌬️ Cool weather. Light jacket recommended.";
            else if (temp <= 30) context = "☀️ Warm and pleasant.";
            else if (temp <= 40) context = "🔥 Hot weather. Stay hydrated!";
            else context = "🌡️ Extremely hot! Avoid prolonged exposure.";
        } else if (unit.contains("Fahrenheit")) {
            if (temp <= -40) context = "⚠️ Extremely cold! Dangerous exposure risk.";
            else if (temp <= 14) context = "❄️ Extremely cold! Bundle up heavily.";
            else if (temp <= 32) context = "❄️ Freezing point of water.";
            else if (temp <= 50) context = "🧥 Very cold. Wear warm clothing.";
            else if (temp <= 68) context = "🌬️ Cool weather. Light jacket recommended.";
            else if (temp <= 86) context = "☀️ Warm and pleasant.";
            else if (temp <= 104) context = "🔥 Hot weather. Stay hydrated!";
            else context = "🌡️ Extremely hot! Avoid prolonged exposure.";
        } else { // Kelvin
            if (temp < 100) context = "❄️ Extremely cold - cryogenic temperatures!";
            else if (temp < 200) context = "❄️ Very cold - below dry ice temperature.";
            else if (temp < 273.15) context = "🌡️ Below freezing point of water.";
            else if (temp < 300) context = "🌡️ Cool to room temperature range.";
            else if (temp < 373.15) context = "☀️ Above room temperature, below boiling.";
            else if (temp < 500) context = "🔥 Above boiling point of water!";
            else context = "🔥⚡ Extremely hot - industrial/plasma temperatures!";
        }

        contextLabel.setText(context);
    }

    private void swapUnits() {
        int fromIndex = fromUnitCombo.getSelectedIndex();
        int toIndex = toUnitCombo.getSelectedIndex();
        fromUnitCombo.setSelectedIndex(toIndex);
        toUnitCombo.setSelectedIndex(fromIndex);

        // Auto-convert if there's a value
        if (!temperatureField.getText().trim().isEmpty()) {
            performConversion();
        }
    }

    private void clearAll() {
        temperatureField.setText("");
        resultLabel.setText("Ready for conversion");
        contextLabel.setText(" ");
        temperatureField.requestFocus();
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(frame,
                message,
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
        temperatureField.requestFocus();
        temperatureField.selectAll();
    }
}