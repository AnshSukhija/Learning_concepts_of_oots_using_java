package Day3_part_2;
import java.util.Scanner;

class Stud {
    String name;
    Scanner sc = new Scanner(System.in); 

    public void inputName() {
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Student Name is: " + name);
    }
}

class Marks extends Stud {
    int marks;

    public void inputMarks() { 
        System.out.println("Enter marks here: ");
        marks = sc.nextInt();
        System.out.println("Student marks entered: " + marks);
    }
}

class Sports extends Marks {
    public void message() {
        System.out.println("Enrolled in sports");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Sports m = new Sports(); 
        m.inputName();
        m.inputMarks();
        m.message();

        m.sc.close(); 
    }
}
