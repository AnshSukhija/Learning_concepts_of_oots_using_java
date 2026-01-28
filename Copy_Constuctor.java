package Day3_part_4;
class Base
{
	int a;
	public Base(int n) {
		a=n;
	}
public Base(Base b)
{
	a=b.a;
}
public void show()
{
	System.out.println("Constructor"+a);
}
}
public class Copy_Constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1=new Base(10);
		b1.show();
		Base b2=new Base(b1);
		b2.show();
				
	}

}
