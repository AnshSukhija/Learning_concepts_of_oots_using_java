package Day13;
import java.awt.*;
import java.awt.event.*;

class ColourDemo extends Frame {

    public ColourDemo() {
        setSize(400, 400);
        setTitle("Color Demo");

        // window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

  
    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.drawString("All The Best", 100, 100);

        g.setColor(Color.cyan);
        g.drawString("All The Best", 150, 150);

        g.setColor(Color.red);
        g.drawString("All The Best", 200, 200);

        g.setColor(Color.black);
        g.drawString("All The Best", 250, 250);
    }

    public static void main(String[] args) {
        new ColourDemo();
    }
}