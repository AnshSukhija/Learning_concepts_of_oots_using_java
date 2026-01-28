package Day13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    
    JLabel userLabel, passLabel, messageLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton;
    JCheckBox showPassword;

    Login() {
        setTitle("Login Page");
        setLayout(new GridLayout(5, 2, 10, 10));

        userLabel = new JLabel("Username:");
        userText = new JTextField();
        add(userLabel);
        add(userText);

        passLabel = new JLabel("Password:");
        passText = new JPasswordField();
        add(passLabel);
        add(passText);

        showPassword = new JCheckBox("Show Password");
        showPassword.addActionListener(this);
        add(new JLabel());
        add(showPassword);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(new JLabel());
        add(loginButton);

        messageLabel = new JLabel();
        add(messageLabel);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = String.valueOf(passText.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                messageLabel.setText("Login successful!");
                messageLabel.setForeground(Color.GREEN);

                 BoxLayoutExample b = new BoxLayoutExample();
                 b.setVisible(true);

                 this.setVisible(false);

            } else {
                messageLabel.setText("Invalid credentials.");
                messageLabel.setForeground(Color.RED);
            }
        }

        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passText.setEchoChar((char) 0);
            } else {
                passText.setEchoChar('*');
            }
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}