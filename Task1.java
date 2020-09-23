import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int a[] = new int[n];
        System.out.println("Enter 20 integers: ");
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        // sorting first 10 elements in ascending order
        for (int i = 9; i >= 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j] > a[j + 1]) {
                    // swapping the elements 
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        // sorting last 10 elements in descending order
        for (int i = n - 1; i >= 10; --i) {
            for (int j = 10; j < i; ++j) {
                if (a[j] < a[j + 1]) {
                    // swapping the elements 
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        // print the answers
        System.out.println("The 20 integers after sorting first 10 in ascending order and last 10 in descending order are: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    } // end of main method
} // end of class 