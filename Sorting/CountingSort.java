package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 3, 2, 5, 2, 8 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1){
            return;
        }

        int max = arr[0];

        for (int num : arr){
            if (num > max){
                max = num;
            }
        }

        int[] countArray = new int[max + 1];

        for (int num : arr){
            countArray[num]++;
        }
        
        int index = 0;
        for (int i = 0; i <= max; i++){
            while (countArray[i] > 0){
                arr[index++] = i;
                countArray[i]--;
            }
        }
    }
}
