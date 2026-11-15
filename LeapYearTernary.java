//25.LeapYearTernary

import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Year = input.nextInt();

        String result = ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0))) ? "The year is a Leap year."
                : "The year is not a Leap year.";
        System.out.println(result);
        input.close();
    }
}