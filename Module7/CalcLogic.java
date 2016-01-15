package Module7;

import java.util.Scanner;

public class CalcLogic {
    public static double calculate(double n1, double n2, String command){
        Scanner scanner = new Scanner(System.in);
        double result = 0;
            switch(command) {
                case "+":
                result = n1 + n2;
                    break;
                case "-":
                result = n1 - n2;
                    break;
                case "*":
                result = n1 * n2;
                    break;
                case "/":
                result = n1 / n2;
                    break;
                case "switch":
                    System.out.println("Choose and print one of the symbols: '^n' or '^1/n'");
                    command = scanner.next();
                    switch(command) {
                        case "^n":
                        result = Math.pow(n1, n2);
                        break;
                        case "^1/n":
                        result = Math.pow(n1 , 1/n2);
                    }
                    break;

                }

            return result;
        }





}
