package Day5;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("\nArray elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}