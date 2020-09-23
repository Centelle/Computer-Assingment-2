import java.util.Scanner;

public class Task5_wrong {
    /**
     * wrong approach to the problem of seperating decimal and integer part of a double
     * using decimal_part[i] = in[i] - integer_part[i];
     * which gives wrong ans
     * because of a double precision error
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // 5 just for now
        double in[] = new double[n];
        for (int i = 0; i < n; ++i) {
            in[i] = sc.nextDouble();
        }
        int integer_part[] = new int[n];
        double decimal_part[] = new double[n];

        for (int i = 0; i < n; ++i) {
            integer_part[i] = (int) in[i];
            decimal_part[i] = in[i] - integer_part[i];
        }

        System.out.print("Integer part = ");
        for (int i = 0; i < n; ++i) {
            System.out.print(integer_part[i] + ", ");
        }

        System.out.print("\nDecimal part =  ");
        for (int i = 0; i < n; ++i) {
            System.out.print(decimal_part[i] + ", ");
        }
        sc.close();
    }
}
