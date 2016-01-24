import java.util.Set;
import java.util.TreeSet;


public class Runner {
    public static void main(String[] args) {
       Set<Flower> flowers = new TreeSet<>(new FlowerNameComparator());
        flowers.add(new Aster("Norwean Aster"));
        flowers.add(new Chamomile("Ukrainian Chamomile"));
        flowers.add(new Tulip("French Tulip"));
        
        Printer.print(flowers);
        
    }
}
