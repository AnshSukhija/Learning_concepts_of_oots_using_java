package Day2;

import java.util.Scanner;

public class Do_while {
	public void  Fibonacci(int n) {
		int i=1;
		int a=1;
		int s=0;
		do{
			System.out.print(s+" ");
			int temp =s+a;
			s=a;
			a=temp;
			i++;
		}
		while(i<=n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number here:");
		int n=sc.nextInt();
		Do_while  gc= new  Do_while();
		gc.Fibonacci(n);
		sc.close();
	}

}
