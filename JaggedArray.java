package Day5;
import java.util.*;
class JA
{	int [][]jarray= new int[3][];
Scanner sc=new Scanner(System.in);
	public void declare()
	{
	for(int i=0;i<3;i++)
		{
			System.out.println("Enter the size of row"+(i+1));
			jarray[i]=new int[sc.nextInt()];
		}
		
	}
	public void input()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the elements of row"+(i+1));
			for(int j=0;j<jarray[i].length;j++)
			{
				jarray[i][j]=sc.nextInt();
			}
			
		}
		
	}
	public void display()
	{
		System.out.println("Jagged Array");
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<jarray[i].length;j++)
			{
				System.out.print(jarray[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}
}
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JA obj=new JA();
obj.declare();
obj.input();
obj.display();

	}

}