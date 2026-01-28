package Day7;
import Mypackage.*;
import Subpackage.*;
import Mypackage1.*;
public class Mypackageexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypackage.Message msg = new Mypackage.Message();
		msg.display();
		Mypackage1.Message msg1 = new Mypackage1.Message();
		msg1.display();
		Students s = new Students();
		s.display();
		s.display2();
		Addition obj=new Addition();
		System.out.println(obj.add(13,56));
		Specifier sg= new Specifier();
		System.out.println(sg.a);
		//System.out.println(sg.b);
		System.out.println(sg.c);
		System.out.println(sg.d);
		
	}

}
