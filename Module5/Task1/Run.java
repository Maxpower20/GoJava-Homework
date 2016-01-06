public class Run {
    public static void main(String[] args) {
        int[] intArray = {12, 2, 44, 45, 1, 101, 104, 2016, 99};

        Sort.sort(intArray);

        int min = intArray[0];
        int max = intArray[intArray.length-1];
        System.out.println("The biggest number in array is " + max);
        System.out.println("The smallest number in array is " + min);

    }
}
