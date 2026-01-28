package Day2;

public class Airthmetic_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int a=2;
		int b=4;
		int c=0;
		switch(n){
			case 1:
				c=a+b;break;
			case 2:
				c=a-b;break;
			case 3:
				c=a*b;break;
			case 4:
				c=a/b;break;
			default : 
				System.out.println("wrong input");
		}
		System.out.println("Result is: "+c);
	}

}
