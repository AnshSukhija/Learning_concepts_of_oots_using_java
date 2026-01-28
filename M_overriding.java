package Day3_part_4;
class Base1
{
	public void show()
	{
		System.out .println("Base class Method");
	}
}
class Derived extends Base1
{
	public void show()
	{
		super.show();
		System.out .println("Derived class Method");
	}
}
public class M_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj1=new Derived();
		obj1.show();
	}

}
