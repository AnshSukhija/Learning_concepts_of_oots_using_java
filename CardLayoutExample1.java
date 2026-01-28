package Day13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CardLayoutExample1 extends JFrame implements ActionListener{
	CardLayout crd;
	JButton btn1,btn2,btn3;
	Container cPane;
	CardLayoutExample1(){
		cPane = getContentPane();
		crd = new CardLayout();
		cPane.setLayout(crd);
		btn1 = new JButton("Apple");
		btn2 = new JButton("Boy");
		btn3 = new JButton("Cat");
		cPane.add("a",btn1);
		cPane.add("b",btn2);
		cPane.add("c",btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		crd.next(cPane);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardLayoutExample1 c1= new CardLayoutExample1();
		c1.setSize(300,300);
		c1.setVisible(true);              
	    c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
