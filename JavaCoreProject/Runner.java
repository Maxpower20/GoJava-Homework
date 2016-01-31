import java.util.Scanner;

public class Runner {
        private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, enter a card number to validate");
        String cardNumber = userInput.nextLine();
        boolean result = LuhnAlgorythmCardValidator.validateCard(cardNumber);
        LuhnAlgorythmCardValidator.printValidationResult(result);
    }
}
