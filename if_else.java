package Day1;
import java.util.*;
public class if_else {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if (n1>n2) {
			System.out.println(n1+" is greater than "+n2);
		}
		else {
			System.out.println(n2+" is greater than "+n1);
		}
		sc.close();

	}

}
