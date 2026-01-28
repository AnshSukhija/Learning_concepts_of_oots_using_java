package Day1;
import java.util.*;
public class total_average {
public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in); 
	        System.out.println("Enter Student Name: ");
	        String name = sc.nextLine();
	        System.out.println("enter the marks of 3 subjects:");
	        int marks1 = sc.nextInt();
	        int marks2 = sc.nextInt();
	        int marks3 = sc.nextInt();
	        int total = marks1 + marks2 + marks3;
	        float average = total / 3;
	        System.out.println("Student Name: " + name);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);
	        
	        
	        sc.close();
	    }
}
