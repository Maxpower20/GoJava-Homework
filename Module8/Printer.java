import java.util.Set;

public class Printer {
    static void print(Set flowers){
        System.out.println("Flowers:");

        for (Object b: flowers){
            System.out.println("---------");
            System.out.println(b.toString());
        }
    }
}
