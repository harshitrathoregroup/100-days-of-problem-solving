package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 4, 3 };
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j > 0; j++){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
