package Day5;

// Functional interface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaMultiParameter {
    public static void main(String[] args) {
        
        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;

        // Lambda expression for division (integer division)
        Calculator divide = (a, b) -> b != 0 ? a / b : 0; // avoid divide by zero
        
        // Calling lambda expressions
        System.out.println("Addition of 10 and 5 is: " + add.operate(10, 5));
        System.out.println("Subtraction of 10 and 5 is: " + subtract.operate(10, 5));
        System.out.println("Multiplication of 10 and 5 is: " + multiply.operate(10, 5));
        System.out.println("Division of 10 and 5 is: " + divide.operate(10, 5));
    }
}