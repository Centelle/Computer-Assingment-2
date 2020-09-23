import java.util.Scanner;

public class Task5_Fix {
    /**
     * 
     * A correct way to solve an challenging problem of seperating decimal and integer part of a double
     * without getting a double precision error
     * technique is to parition the string based on the position of ht e decimal point,
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String in[] = new String[n];
        for(int i = 0; i < n; ++i){
            in[i] = sc.nextLine();
        }
        int integer_part [] = new int[n];
        int decimal_part [] = new int[n];
        for(int i = 0; i < n; ++i){
            String c = in[i];
            int dot = c.indexOf(".");
            if(dot == -1){
                integer_part[i] = Integer.parseInt(c);
                decimal_part[i] = 0;
            } else {
                integer_part[i] = Integer.parseInt(c.substring(0, dot));
                decimal_part[i] = Integer.parseInt(c.substring(dot + 1));
            }
        }
        System.out.print("Integer part = " );
        for(int i = 0 ; i < n; ++i){
            System.out.print(integer_part[i] + ", ");
        }

        System.out.print("\nDecimal part = " );
        for(int i = 0; i < n; ++i){
            System.out.print("0." + decimal_part[i] + ", ");
        }
        sc.close();
    } // end of main method
} // end of class 