import java.util.List;


public class Bouquet {
    private String name;
    private int quantityOfFlowers;

    private List<Flower> flowers;


    public void addFlowers(List<Flower> flowers) throws NoFlowersException {
        if (flowers.size() == 0)throw new NoFlowersException("At least one flower is needed for a bouquet");

        }
    }
