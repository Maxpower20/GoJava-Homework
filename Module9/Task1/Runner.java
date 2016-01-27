import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Please enter a text or a word below you want to encrypt into Caesar encryption");
        String text = userInput1.nextLine();
        System.out.println("Please enter a number os steps you want to encrypt into Caesar encryption");
        int step = userInput1.nextInt();
        String encrypted = CesarTool.encrypt(text, step);
        System.out.println(encrypted);


        System.out.println("Decrypted word will be:");
        System.out.println(CesarTool.decrypt(encrypted, step));



    }
}
