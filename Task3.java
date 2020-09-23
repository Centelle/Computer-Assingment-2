import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // n => length of array = 10
        int years [] = new int [n];
        System.out.println("Enter " + n + " years: ");
        // input all the years 
        for(int i = 0; i < n; ++i){
            years[i] = sc.nextInt();
        }
        System.out.print("Graduation year to find: ");
        int k = sc.nextInt();
        boolean present  = false;
        // linear search the year 
        for(int i = 0; i < n; ++i){
            if(years[i]== k){
                // if found, set present = true and break
                present = true;
                break;
            }
        }
        if(present){
            System.out.println("record exists");
        } else {
            System.out.println("Record does not exist");
        }
        sc.close();
    } // end of main method
} // end of class 
