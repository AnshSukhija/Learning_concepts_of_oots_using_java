package Assessment_1;
import java.util.*;
class Rectanglej{
	double length,width;
	Rectanglej(double length, double width) {
        this.length = length;
        this.width = width;
	}
	double calculateArea() {
        return length * width;
	}
	double calculatePerimeter() {
        return 2 * (length + width);
	}

}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter length:");
		int m= sc.nextInt();
		System.out.println("Enter width :");
		int n= sc.nextInt();
        Rectanglej r1 = new Rectanglej(m,n);
        System.out.println("Length: " + r1.length + ", Width: " + r1.width);
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());
        sc.close();
	}

}
