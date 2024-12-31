import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] heights = new int[]{10, 20, 30, 10};
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(function(heights, 0, dp));

        for (int i = 0; i < n; i++){
            int fs = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1){
                ss = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }

            dp[i] = Math.min(fs, ss);
        }

        System.out.println(dp[n - 1]);
    }

    static int function(int[] arr, int idx, int[] dp){
        if (idx == arr.length - 1){
            return 0;
        }
        if (idx >= arr.length){
            return Integer.MAX_VALUE;
        }
        
        if (dp[idx] != -1){
            return dp[idx];
        }

        int oneJump = function(arr, idx + 1, dp) + Math.abs(arr[idx] - arr[idx + 1]);
        
        int twoJump = Integer.MAX_VALUE;
        if (idx + 2 < arr.length) {
            twoJump = function(arr, idx + 2, dp) + Math.abs(arr[idx] - arr[idx + 2]);
        }
        
        return dp[idx] = Math.min(oneJump, twoJump);
    }
}
