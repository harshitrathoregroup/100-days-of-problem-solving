package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 4, 3 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean swap = false;
            
            for (int j = 1; j < n - i; j++){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }

            if (!swap){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
