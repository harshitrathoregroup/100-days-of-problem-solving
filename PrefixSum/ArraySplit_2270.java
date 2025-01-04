package PrefixSum;

public class ArraySplit_2270 {
    public static void main(String[] args) {
        int[] arr = {10,4,-8,7};
        System.out.println(waysToSplitArray(arr));
    }
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;

        for (int i = 0; i < n; i++){
            totalSum += nums[i];
        }

        long splits = 0;
        long sumFromLeft = 0;
        for (int i = 0; i < n - 1; i++){
            sumFromLeft += nums[i];
            long sumFromRight = totalSum - sumFromLeft;
            if (sumFromLeft >= sumFromRight){
                splits++;
            }
        }
        return (int)splits;
    }
}
