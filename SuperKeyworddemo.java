package Assessment_1;

import java.util.Scanner;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    int empId;
    Employee(String name, int empId) {
        super(name); 
        this.empId = empId;
    }
    void show() {
        super.show();
        System.out.println("Employee ID: " + empId);
    }
}
public class SuperKeyworddemo {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        int empId= sc.nextInt();
        Employee e1 = new Employee(name,empId);
        e1.show();
        sc.close();
    }
}
