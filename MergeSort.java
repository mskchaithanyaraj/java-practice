import java.util.Arrays;
import java.util.Random;
public class MergeSort {
    public static void main(String args[]) {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i=0;i<10;i++) arr[i] = rand.nextInt(30);

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr){
        int size = arr.length;

        if(size < 2) return;

        int mid = size/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[size-mid];

        for(int i=0;i<mid;i++) leftHalf[i] = arr[i];
        for(int i=mid;i<size;i++) rightHalf[i-mid] = arr[i];

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge
        merge(arr,leftHalf,rightHalf);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i=0, j=0, k=0;
        int leftSize = left.length, rightSize = right.length;
        while(i<leftSize && j<rightSize) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}   