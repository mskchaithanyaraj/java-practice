package local;

import java.util.Arrays;

public class Utils {
    public static <X> void println(X value) {
        System.out.println(value);
    }
    public static <X> void print(X value) {
        System.out.print(value);
    }
    public static <X> void printArr(int[] arr) { System.out.println(Arrays.toString(arr));}
}
