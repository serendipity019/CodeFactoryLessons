package gr.aueb.cf.ch8;

public class SwapApp {
    public static void main(String[] args){
        int[] arr = {1, 10};
        swap(arr);
        printArray(arr);

    }

    public static void swap(int[] arr){
        if(arr.length != 2) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[]){
        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
