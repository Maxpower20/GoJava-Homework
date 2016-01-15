package Module7;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number below and press 'return':");
        double number1 = scanner.nextDouble();

        System.out.println("Please input second number below and press 'return':");
        double number2 = scanner.nextDouble();

        System.out.println("Please enter one of the symbols shown below and press 'return'");
        System.out.println(" +");
        System.out.println(" -");
        System.out.println(" *");
        System.out.println(" /");

        System.out.println("In case you want to use advanced operation, please type 'switch' below and press 'return'");
        String command = scanner.next();

        System.out.println("Your result will be: " + CalcLogic.calculate(number1, number2, command));
    }
}
