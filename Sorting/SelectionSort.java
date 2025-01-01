package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 4, 3 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            
            int maxIdx = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[maxIdx]){
                    maxIdx = j;
                }
            }
            if (maxIdx != i){
                int temp = arr[maxIdx];
                arr[maxIdx] = arr[i];
                arr[i] = temp;
            }
        } 

        System.out.println(Arrays.toString(arr));
    }
}
