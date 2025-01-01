import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }


    static int missingNumber(int[] arr){
        int i = 0;
        
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < arr.length; i++){
            if (arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
