public class Sorting {
    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>0; i--){
            for(int a=0; a<i; a++){
                if(arr[a]>arr[a+1]){
                    int tmp = arr[a];

                    arr[a]=arr[a+1];
                    arr[a+1]=tmp;
                }
            }
        }
    }
}
