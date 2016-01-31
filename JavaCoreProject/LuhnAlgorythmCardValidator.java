public class LuhnAlgorythmCardValidator {
    final static int CARDLENGTH = 16;


    static boolean validateCard(String cardNumber){
        if (cardNumber.length() < CARDLENGTH) {
            throw new IllegalArgumentException("Card Number length must be 16 characters!");
        }

            int sum = 0;
        for (int i = 0; i < cardNumber.length(); i++){

            int tmp = Character.getNumericValue(cardNumber.charAt(i));
            int product;
            if (i % 2 != 0){
                product = tmp;

            }
            else{
                product = tmp * 2;
            }
            if (product > 9)
                product -= 9;
            sum+= product;
        }
        
        return (sum % 10 == 0);


        }


    public static void printValidationResult(boolean valid){
        if (valid){
            System.out.println("Card number is valid");
        }
        else {
            System.out.println("Card number is invalid");
        }
    }

    }
