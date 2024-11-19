package gr.aueb.cf.ch8;

public class SelectionSort {
    public static void main(String[] args) {

    }

    public static int[] selectionSort(int[] arr){
        for( int i =0; i <= arr.length - 1; i++){
            // find min
            int minPosition = i;
            int minValue = arr[minPosition];

            for( int j =i; j < arr.length; j++){
                if (arr[j] < minValue){
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            //swap
            swap(arr, minPosition, i);

        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
