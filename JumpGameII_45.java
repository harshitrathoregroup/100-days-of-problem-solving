import java.util.Arrays;

public class JumpGameII_45 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };

        System.out.println(jumpTabulation(arr));
    }

    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return function(nums, 0, dp);
    }

    static int function(int[] nums, int idx, int[] dp) {
        if (idx == nums.length - 1) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int maxReach = nums[idx] + idx;
        int min = Integer.MAX_VALUE - 1;
        for (int jump = idx + 1; jump <= maxReach && jump < nums.length; jump++) {
            int val = 1 + function(nums, jump, dp);
            min = Math.min(val, min);
        }

        return dp[idx] = min;
    }

    public static int jumpTabulation(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE - 1);

        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int maxReach = Math.min(i + nums[i], n - 1);

            for (int j = i + 1; j <= maxReach; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[j]);
            }
            // System.out.println(Arrays.toString(dp));
        }

        return dp[0];
    }
}