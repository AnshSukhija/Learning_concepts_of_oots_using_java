package Day3_part_3;
class Student {
    String name;
    int age;

    // Default constructor (no parameters)
    Student() {
        name = "Unknown";
        age = 18;
        System.out.println("Default constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        // Creating object -> default constructor will be called automatically
        Student s1 = new Student();

        // Display values
        s1.display();
    }
}
