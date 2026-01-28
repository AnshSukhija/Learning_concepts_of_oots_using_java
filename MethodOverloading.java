package Assessment_1;
class Calculator {
 int add(int a, int b) {
     return a + b;
 }
 int add(int a, int b, int c) {
     return a + b + c;
 }
 double add(double a, double b) {
     return a + b;
 }
}

public class MethodOverloading {
 public static void main(String[] args) {
         Calculator calc = new Calculator();
         System.out.println("Sum of 2 integers: " + calc.add(2,5));
         System.out.println("Sum of 3 integers: " + calc.add(4,7,9));
         System.out.println("Sum of 2 doubles: " + calc.add(6.2,7.8));
 	}

}
