package Assessment_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    JLabel nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel, termsLabel;
    JTextField nameField, mobileField, dobField;
    JRadioButton maleButton, femaleButton;
    ButtonGroup genderGroup;
    JTextArea addressArea, outputArea;
    JCheckBox termsCheckBox;
    JButton submitButton, resetButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(180, 50, 200, 30);
        add(nameField);

        mobileLabel = new JLabel("Mobile No:");
        mobileLabel.setBounds(50, 100, 100, 30);
        add(mobileLabel);
        mobileField = new JTextField();
        mobileField.setBounds(180, 100, 200, 30);
        add(mobileField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 150, 100, 30);
        add(genderLabel);
        maleButton = new JRadioButton("Male");
        maleButton.setBounds(180, 150, 80, 30);
        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(260, 150, 100, 30);
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        add(maleButton);
        add(femaleButton);

        dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(50, 200, 100, 30);
        add(dobLabel);
        dobField = new JTextField("DD/MM/YYYY");
        dobField.setBounds(180, 200, 200, 30);
        add(dobField);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 250, 100, 30);
        add(addressLabel);
        addressArea = new JTextArea();
        addressArea.setBounds(180, 250, 200, 60);
        add(addressArea);

        termsCheckBox = new JCheckBox("I accept the Terms & Conditions.");
        termsCheckBox.setBounds(100, 330, 300, 30);
        add(termsCheckBox);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 380, 100, 30);
        add(submitButton);
        resetButton = new JButton("Reset");
        resetButton.setBounds(250, 380, 100, 30);
        add(resetButton);

        outputArea = new JTextArea();
        outputArea.setBounds(50, 430, 380, 100);
        outputArea.setEditable(false);
        add(outputArea);

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            if (termsCheckBox.isSelected()) {
                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "Not Selected");
                String dob = dobField.getText();
                String address = addressArea.getText();

                outputArea.setText("Registration Details:\n");
                outputArea.append("Name: " + name + "\n");
                outputArea.append("Mobile: " + mobile + "\n");
                outputArea.append("Gender: " + gender + "\n");
                outputArea.append("DOB: " + dob + "\n");
                outputArea.append("Address: " + address + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "Please accept the Terms & Conditions to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            mobileField.setText("");
            genderGroup.clearSelection();
            dobField.setText("");
            addressArea.setText("");
            termsCheckBox.setSelected(false);
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

