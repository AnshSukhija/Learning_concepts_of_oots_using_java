package Day13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame implements ActionListener {
    JButton yes, no, close;
    JLabel lbl;

    ButtonDemo() {
        yes = new JButton("YES");
        no = new JButton("No");
        close = new JButton("CLOSE");
        lbl = new JLabel("");

        setLayout(new GridLayout(4, 1));
        setSize(400, 200);

        add(yes);
        add(no);
        add(close);
        add(lbl);

        // Add action listeners
        yes.addActionListener(this);
        no.addActionListener(this);
        close.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yes) {
            lbl.setText("You clicked YES");
        } else if (e.getSource() == no) {
            lbl.setText("You clicked NO");
        } else if (e.getSource() == close) {
            System.exit(0); // close the program
        }
    }

    // main method
    public static void main(String[] args) {
        new ButtonDemo();
    }
}