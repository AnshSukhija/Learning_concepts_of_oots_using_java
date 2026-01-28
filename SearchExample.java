package Day5;

import java.util.Scanner;
import java.util.Arrays;

class Search {
    int[] a = new int[10];
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter 10 elements");
        for (int i = 0; i < 10; i++)
            a[i] = sc.nextInt();
    }

    public void sort() {
        Arrays.sort(a);
    }

    public int linearsearch(int item) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item)
                return (i + 1);
        }
        return -1;
    }

    public int binarysearch(int item) {
        int f = 0, l = a.length - 1;
        int mid;
        while (f <= l) {
            mid = (f + l) / 2;
            if (a[mid] == item)
                return (mid + 1);
            else if (a[mid] < item)
                f = mid + 1;
            else
                l = mid - 1;
        }
        return -1;
    }
}

public class SearchExample {

    public static void main(String[] args) {
        Search obj = new Search();
        obj.input();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search for:");
        int target = sc.nextInt();

        int pos = obj.linearsearch(target);
        if (pos == -1)
            System.out.println("Not Found using linear search");
        else
            System.out.println("Element found at position " + pos + " using linear search");
        
        obj.sort();
        pos = obj.binarysearch(target);
        if (pos == -1)
            System.out.println("Not Found using binary search");
        else
            System.out.println("Element found at position " + pos + " using binary search");
    }
}