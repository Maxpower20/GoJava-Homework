public class Run {
    public static void main(String[] args) {
        int[] intArray = {12, 2, 44, 45, 1, 101};

        Arrays.sort(intArray);

        System.out.println("The biggest number in array is " + intArray[5]);
        System.out.println("The smallest number in array is " + intArray[0]);

    }
}
