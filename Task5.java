import java.util.Scanner;
public class Task5 {
    /**
     * Challenge: Separate the integer and the decimal part of the number and print both
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // n => length of array
        double A[] = new double[n]; // creating a array of doubles to store the input 
        int B [] = new int[n]; // array of integer to store the integer part of numbers 
        System.out.println("Enter 10 decimals: ");
        // read the input 
        for(int i = 0; i < n; ++i){
            A[i] = sc.nextDouble();
        }
        for(int i = 0; i < n; ++i){
            B[i] = (int) A[i]; // casting to int truncates the value after the decimal point
        }

        System.out.print("Integer part of all numbers after truncating decimal part truncated = \n" );
        // print the answers
        for(int i = 0; i < n; ++i){
            System.out.print(B[i] + ", ");
        }
        System.out.println();
        sc.close();
    } // end of main method
} // end of class 
