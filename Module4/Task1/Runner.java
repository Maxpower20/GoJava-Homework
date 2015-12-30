package Module4.Task1;

/**
 * Created by Максим on 30.12.2015.
 */
    public class Runner {
        public static void main(String[] args) {
            Triangle triangle = new Triangle(4, 5);
            Rectangle rectangle = new Rectangle(8, 10);
            Circle circle = new Circle(5);


            System.out.println("The area of a triangle is " + triangle.calculateAreaOfTriangle() + " sm^2");
            System.out.println("The area of a rectangle is " + rectangle.calculateAreaOfRectangle() + " sm^2");
            System.out.println("The area of a circle is " + circle.calculateAreaOfCircle() + " sm^2");
        }
    }
