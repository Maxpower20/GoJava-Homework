public class Sort {
    public static int findMax(int[] arr)
        {
            int arr_max = arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] > arr_max)
                {
                    arr_max = arr[i];
                }
            }
            System.out.print("Maximum integer of the array is ");
            return arr_max;
        }

        public static int findMin(int arr[])
        {
            int arr_min = arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] < arr_min)
                    arr_min = arr[i];
            }
            System.out.print("Minimum integer of the array is ");
            return arr_min;
        }
}
