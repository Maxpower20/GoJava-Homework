import static Module4.Extra.MonteCarloIntegration.MonteCarlo;


public class Runner {
    public static void main(String[] args) {
        System.out.println("The integrated value of our function by a Monte-Carlo method is: " + MonteCarlo(0, 1, 123456));
    }


}
