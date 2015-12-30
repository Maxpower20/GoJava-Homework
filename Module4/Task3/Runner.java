package Module4.Task1.Task3;

/**
 * Created by Максим on 30.12.2015.
 */
public class Runner {
    public static void main(String[] args) {
        Point1 point1 = new Point1(3, 7);
        Point1 point2 = new Point1(18, 9.5);

        System.out.println("Coordinates of point1 are: X1= " + point1.getX1() + " and Y1= " + point1.getY1());
        System.out.println("Coordinates of point2 are: X2= " + point2.getX1() + " and Y2= " + point2.getY1());
        System.out.println("Lenght between points is: " + Calculation.lenghtBetweenPoints(point1, point2));
    }
}
