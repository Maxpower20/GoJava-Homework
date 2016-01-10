public class MonteCarloIntegration {


    // Make f some function
    public static double f(double x){
        return Math.cos(x); //We can change function type here. Real valued function is needed
    }

    public static double MonteCarlo(double a, double b, long numberOfIterations){
        // [a, b] are numbers which will create an interval(a<b)
        if (a>b){//switch a with b if a>b
            return MonteCarlo(b, a, numberOfIterations);
        }
        double sum = 0;
        double x = 0;
        for (long i = 1; i<=numberOfIterations; i++){
            x = Math.random();
            sum = sum + f(a+((b-a)*x));
        }
        sum = ((b-a)/numberOfIterations)*sum;

        return sum;

    }
}
