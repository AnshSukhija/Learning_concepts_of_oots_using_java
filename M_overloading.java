package Day3_part_4;
class Addition
{
	public int add(int a,int b)
	{
		return (a+b);
	}
		public String add(String s1,String s2)
		{
			return(s1+""+s2);
		}
}

public class M_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		System.out.println(obj.add(5, 10));
		System.out.println(obj.add("ansh","sukhija"));
	}
}
