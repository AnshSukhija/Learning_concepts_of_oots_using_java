package Day8;
//Step 1: Create a user-defined exception class
class InvalidAgeException extends Exception {
 // Constructor with custom message
 public InvalidAgeException(String message) {
     super(message);
 }
}

//Step 2: Class that uses the exception
public class Userdefinedexception {
 // Method that checks eligibility
 static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         // Throw custom exception
         throw new InvalidAgeException("Age must be 18 or above to vote.");
     } else {
         System.out.println("You are eligible to vote.");
     }
 }

public static void main(String[] args) {
    try {
        int userAge = 16; // test with different ages
        checkAge(userAge);
    } catch (InvalidAgeException e) {                                                     
        System.out.println("Caught Exception: " + e.getMessage());
    }

    System.out.println("Program continues after exception handling...");
}
}
