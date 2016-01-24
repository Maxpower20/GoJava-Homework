import java.util.Set;



public class Bouquet {
    private String flowerName;
    private int quantityOfFlowers;

    private Set<Flower> flowers;

    public Bouquet(Set<Flower> flowers) {
        this.flowers = flowers;
    }



    public void addFlowers(Set<Flower> flowers) throws NoFuneralBouquetException {
        if (flowers.isEmpty())throw new IllegalArgumentException("At least one flower is needed for a bouquet");


        if (flowers.size() %2 == 0 ) throw new NoFuneralBouquetException("The number of flowers in the bouquet is even");
        flowers.add((Flower) flowers);
        }

    public Set<Flower> getFlowers() {
        return flowers;
    }

}
