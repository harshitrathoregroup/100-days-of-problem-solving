package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 4, 3 };
        int n = arr.length;
        mergeSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int n){
        if (n < 2){
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        
        for (int i = 0; i < mid; i++){
            l[i] = arr[i];
        }

        for (int i = mid; i < n; i++){
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(arr, l, r, mid, n - mid);
    }

    private static void merge(int[] arr, int[] l, int[] r, int left, int right){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right){
            if (l[i] <= r[j]){
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        while (i < left){
            arr[k++] = l[i++];
        }

        while (j < right){
            arr[k++] = r[j++];
        }
    }
}
