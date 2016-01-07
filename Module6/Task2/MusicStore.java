import java.util.Scanner;


public class MusicStore {
    public static void main(String[] args) {
        ArrayList<Instrument> instrumentList = new ArrayList<Instrument>();
        System.out.println("Please enter a number of music instruments you want to have in your store:");
        final Scanner scanner = new Scanner(System.in);
        final int userInput = scanner.nextInt();

        try {
            instrumentList.add(new Piano());
            instrumentList.add(new Guitar());
            instrumentList.add(new Trumpet());
            instrumentList.add(new Piano());
            instrumentList.add(new Piano());
            instrumentList.add(new Guitar());

            if (userInput <= instrumentList.size()) {
                throw new TooManyElementsException(userInput);

            }
        } catch (TooManyElementsException e) {
            int difference = instrumentList.size() - e.getMinElements();
            System.out.println("You music store already has " + difference + " more instruments that you need");
        }
    }

}
