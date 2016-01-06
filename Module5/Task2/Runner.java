public class Runner {
    public static void main(String[] args) {
        double[] doubleArray = {7.2, 2.2, 1.5, 1.0, 5.0};

        boolean swapOccured = true;

        while(swapOccured){

            swapOccured = false;

            for(int i = 0; i < doubleArray.length - 1; i++){
                if(doubleArray[i] > doubleArray[i+1]){
                    double tempVariable = doubleArray[1];

                    doubleArray[i] = doubleArray[i+1];
                    doubleArray[i+1] = tempVariable;

                    swapOccured = true;
                }
            }
        }

        for(double element: doubleArray){
            System.out.println(element);
        }
    }
}
