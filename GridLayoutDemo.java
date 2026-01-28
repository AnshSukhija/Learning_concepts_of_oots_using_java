package Day13;
import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
		JFrame frameobj;
		GridLayoutDemo(){
			frameobj = new JFrame();
			 JButton btn1 = new JButton("1");
		     JButton btn2 = new JButton("2");
		     JButton btn3 = new JButton("3");
		     JButton btn4 = new JButton("4");
		     JButton btn5 = new JButton("5");
		     JButton btn6 = new JButton("6");
		     JButton btn7 = new JButton("7");
		     JButton btn8 = new JButton("8");
		     JButton btn9 = new JButton("9");

			frameobj.add(btn1);frameobj.add(btn2);frameobj.add(btn3);
			frameobj.add(btn4);frameobj.add(btn5);frameobj.add(btn6);
			frameobj.add(btn7);frameobj.add(btn8);frameobj.add(btn9);
			frameobj.setLayout(new GridLayout(3,3));
			frameobj.setSize(300,300);
			frameobj.setVisible(true);              
		    frameobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
