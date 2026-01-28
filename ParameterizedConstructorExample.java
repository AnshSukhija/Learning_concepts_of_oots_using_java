package Day3_part_3_1;

import Day3_part_3_1.Studentj;

class Studentj {
    String name;
    int age;

    // Parameterized constructor
    Studentj(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Studentj s1 = new Studentj("Rahul", 20);
        Studentj s2 = new Studentj("Sneha", 22);

        // Display values
        s1.display();
        s2.display();
    }
}
