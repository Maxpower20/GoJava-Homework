import java.util.Comparator;


public class FlowerNameComparator implements Comparator<Flower> {

    public int compare(Flower flower1, Flower flower2){

        return flower1.getName().compareToIgnoreCase(flower2.getName());
    }
}
