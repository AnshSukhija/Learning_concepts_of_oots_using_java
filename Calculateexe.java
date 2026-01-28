package Day1;
import Airthmatic.Calculate;
import java.util.*;
public class Calculateexe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter a:");
        int b= sc.nextInt();
		Calculate c= new Calculate();
      	 System.out.println("Addition: "+c.add(a,b));
        System.out.println("Subtraction: "+c.sub(a,b)  );
        System.out.println("Multiplication: "+c.mul(a,b) );
        System.out.println("division: " +c.div(a,b));
        sc.close();

	}

}
