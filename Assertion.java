package Day7;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =19;
		assert age>= 18:"age is less than 18, not eligible:";
		System.out.println("age is valid,you can vote!");
		Specifier sg= new Specifier();
		System.out.println(sg.a);
		//System.out.println(sg.b);
		System.out.println(sg.c);
		System.out.println(sg.d);
	}

}
