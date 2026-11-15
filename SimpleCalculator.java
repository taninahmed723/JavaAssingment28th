//18. Simple Calculator using switch-case.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        String symbol = input.next();
        double num2 = input.nextDouble();

        switch (symbol) {
            case "+":
                System.out.println("Sum = " + (num1 + num2));
                break;
            case "-":
                System.out.println("Sub = " + (num1 - num2));
                break;
            case "x":
                System.out.println("Prod = " + (num1 * num2));
                break;
            case "/":
                System.out.println("Div = " + (num1 / num2));
                break;

            default:
                System.out.println("Syntax Error");
                break;
        }

        input.close();
    }
}