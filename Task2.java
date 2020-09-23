import java.util.Scanner;

public class Task2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 6, m = 4;
      int P[] = new int[n];
      int Q[] = new int[m];
      int R[] = new int[n + m];
      // input array P
      System.out.println("Enter 6 numbers, elements of array P: ");
      for (int i = 0; i < n; ++i) {
         P[i] = sc.nextInt();
      }
      // input array Q
      System.out.println("Enter 4 numbers, elements of array Q: ");
      for (int i = 0; i < m; ++i) {
         Q[i] = sc.nextInt();
      }
      // creating array R of length n + m, which is 4 + 6 = 10
      // inserting then 6 elements of array P in array R
      for (int i = 0; i < n; ++i) {
         R[i] = P[i];
      }
      // inserting the 4 elements of array Q in array R
      for (int i = 0; i < m; ++i) {
         R[i + n] = Q[i];
      }
      System.out.println("Array R = ");
      // displaying array R
      for (int i = 0; i < n + m; ++i) {
         System.out.print(R[i] + ", ");
      }
      System.out.println();
      sc.close();
   } // end of main method
} // end of class 
