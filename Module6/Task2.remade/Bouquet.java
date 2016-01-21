import java.util.List;


public class Bouquet {
    private String name;
    private int quantityOfFlowers;

    private List<Flower> flowers;


    public void addFlowers(List<Flower> flowers) throws NoFuneralBouquetException {
        if (flowers.isEmpty())throw new IllegalArgumentException("At least one flower is needed for a bouquet");


        if (flowers.size() %2 == 0 ) throw new NoFuneralBouquetException("The number of flowers in the bouquet is even");
        }
    }
