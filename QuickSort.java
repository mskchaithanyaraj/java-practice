import java.util.Arrays;
import java.util.Random;

import static local.Utils.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new Random().ints(20,0,20).toArray();

        println("Values Before Sorting: " + Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);

        println("Values After Sorting: " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int p = hoarePartition(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
    }

    private static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;
        while(true) {

            // find leftmost ele >= pivot
            do {
                i++;
            } while(arr[i] < pivot);

            // find rightmost ele < pivot
            do {
                j--;
            } while(arr[j] > pivot);
            if(i>=j) return j;
            swap(arr,i,j);
        }
    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
