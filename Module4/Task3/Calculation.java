package Module4.Task1.Task3;

/**
 * Created by Максим on 30.12.2015.
 */
public class Calculation {

    public static double lenghtBetweenPoints(Point1 p1, Point1 p2){
        return Math.sqrt(((p2.getX1()-p1.getX1())*(p2.getX1()-p1.getX1()))+((p2.getY1()-p1.getY1())*(p2.getY1()-p1.getY1())));
    }
}
