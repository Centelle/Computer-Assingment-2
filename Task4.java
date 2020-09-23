import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // n = number of country names 
        String names [] = new String[n];
        System.out.println("Enter names of 10 countries: ");
        // input names of 10 countries 
        for(int i = 0; i < n; ++i){
            names[i] = sc.next();
        }
        // sort all 10 names of countries in alphabetical order
        for(int i = n - 1; i >= 0; --i){
            for(int j = 0; j < i; ++j){
                if(names[j].compareTo(names[j + 1]) > 0){
                    // swapping the elements 
                    String t = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = t;
                }
            }
        }
        // display all country names sorted alphabetically 
        System.out.println("The names sorted alphabetically: ");
        for(int i = 0; i < n; ++ i){
            System.out.print(names[i] + ", ");
        }
        System.out.println();
        sc.close();
    } // end of main method
} // end of class 