package Day13;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutExample extends JFrame {
	JButton b[];
	public BoxLayoutExample () {
		b = new JButton[5];
		for (int i=0;i<5;i++) {
			b[i]=new JButton("Button"+(i+1));
			add(b[i]);
		}
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setSize(400,400);
		setVisible(true);              
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoxLayoutExample ();
	}

}
