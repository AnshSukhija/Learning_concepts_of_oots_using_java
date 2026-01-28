package Day5;
import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size of 2D array
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Creating 2D array
        int[][] arr = new int[rows][cols];

        // Input values into 2D array
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing 2D array
        System.out.println("2D Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}

