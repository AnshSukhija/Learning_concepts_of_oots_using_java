package Day5;

// Functional interface
interface Square {
    int calculate(int x);
}

public class LambdaSingleParameter {
    public static void main(String[] args) {
        
        // Lambda expression with single parameter
        Square square = (n) -> n * n;
        
        // Call the method
        System.out.println("Square of 5 is: " + square.calculate(5));
        System.out.println("Square of 9 is: " + square.calculate(9));
    }
}