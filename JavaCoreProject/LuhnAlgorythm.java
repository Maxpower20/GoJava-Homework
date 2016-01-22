public class LuhnAlgorythm {
    static boolean luhnAlgo(String cardNumber){
        if (cardNumber.length() < 16) {
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
        System.out.println(sum);
        if (sum % 10 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
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
