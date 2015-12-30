package Module4.Task1;

/**
 * Created by Максим on 30.12.2015.
 */
public class Triangle {
    private int leg1;
    private int height;


    Triangle(int leg1, int height){
        this.leg1 = leg1;
        this.height = height;
    }

    public int getLeg1() {
        return leg1;
    }

    public int getHeight() {
        return height;
    }

    public double calculateAreaOfTriangle() {
        return 0.5 * this.getLeg1() * this.getHeight();

    }

}
