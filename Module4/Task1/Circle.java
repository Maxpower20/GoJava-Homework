package Module4.Task1;

/**
 * Created by Максим on 30.12.2015.
 */
public class Circle {
    final double p = 3.14;
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getP() {
        return p;
    }

    public double calculateAreaOfCircle() {
        return this.getP() * (this.getRadius() * this.getRadius());

    }
}
