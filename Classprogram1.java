package Assignment;
class MyClass {
    public void greet() {
        System.out.println("Hello! Welcome to Java.");
    }
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
public class Classprogram1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();   
        obj.greet();   
        int sum = obj.addNumbers(10, 20);
        System.out.println("Sum is: " + sum);
    }
}
