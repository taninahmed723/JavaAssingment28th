//20. 1+2/4+3/8+4/16+.......+n/2'n = ?

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (i / (Math.pow(2, i)));
        }

        System.out.println("Sum of the series 1+2/4+3/8+4/16+.......+n/2'n = " + (sum + 0.5));

        System.out.println("(Where, n = " + n + ")");

        input.close();
    }
}