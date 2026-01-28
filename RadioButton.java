package Day13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButton implements ItemListener {
    final JFrame frame = new JFrame("JRadioButton Demo");

    public RadioButton() {
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ev) {
        boolean selected = (ev.getStateChange() == ItemEvent.SELECTED);
        AbstractButton button = (AbstractButton) ev.getItemSelectable();
        String command = button.getActionCommand();

        String state = selected ? "selected" : "unselected";
        String message;

        if (command.equals("Java")) {
            message = "The Java option has been " + state;
        } else if (command.equals("ASP")) {
            message = "The ASP.Net option has been " + state;
        } else {
            message = "The SQL option has been " + state;
        }

        JOptionPane.showMessageDialog(frame, message);
    }

    public static void main(String[] args) {
        JRadioButton rdbJava = new JRadioButton("Java");
        rdbJava.setActionCommand("Java");

        JRadioButton rdbASP = new JRadioButton("ASP.Net");
        rdbASP.setActionCommand("ASP");

        JRadioButton rdbSQL = new JRadioButton("SQL");
        rdbSQL.setActionCommand("SQL");
        RadioButton r = new RadioButton();
        rdbJava.addItemListener(r);
        rdbASP.addItemListener(r);
        rdbSQL.addItemListener(r);
        final ButtonGroup group = new ButtonGroup();
        group.add(rdbJava);
        group.add(rdbASP);
        group.add(rdbSQL);
        r.frame.add(rdbJava);
        r.frame.add(rdbASP);
        r.frame.add(rdbSQL);
    }
}