package Day5;

public class CountOfTwoNumbers {

    // Method to compare count of arg1 and arg2 in array
    public boolean compareCountOf(int[] arr, int arg1, int arg2) {
        int count1 = 0;
        int count2 = 0;

        // Count occurrences of arg1 and arg2 in the array
        for (int num : arr) {
            if (num == arg1) {
                count1++;
            }
            if (num == arg2) {
                count2++;
            }
        }

        // Return true if count of arg1 is greater than count of arg2
        return count1 > count2;
    }

    // Main method to test
    public static void main(String[] args) {
        CountOfTwoNumbers obj = new CountOfTwoNumbers();

        int[] arr = {1, 2, 3, 2, 4, 2, 5, 1, 1};

        System.out.println("Is count of 1 > 2? " + obj.compareCountOf(arr, 1, 2));
        System.out.println("Is count of 2 > 1? " + obj.compareCountOf(arr, 2, 1));
        System.out.println("Is count of 3 > 5? " + obj.compareCountOf(arr, 3, 5));
    }
}