package Module4.Task1;

/**
 * Created by Максим on 30.12.2015.
 */
public class Rectangle {
    private int sideA;
    private int sideB;

    Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public double calculateAreaOfRectangle() {
        return this.getSideA() * this.getSideB();

    }
}
