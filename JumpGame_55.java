import java.util.Arrays;

public class JumpGame_55 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 3, 1, 1, };

        // approach-1
        // tc-o(n)
        int goal = nums.length;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= goal) {
                goal = i;
            }
        }

        System.out.println(goal == 0);

        int[] dp = new int[nums.length + 1];
        
        Arrays.fill(dp, -1);

        System.out.println(memoization(nums, 0, dp));
    }

    //approach-2
    //tc-o(n*n)
    private static boolean memoization(int[] nums, int idx, int[] dp) {
        if (idx == nums.length - 1){
            return true;
        }

        if (nums[idx] == 0){
            return false;
        }

        if (dp[idx] != -1){
            return dp[idx] == 1;
        }

        int maxReach = Math.min(idx + nums[idx], nums.length - 1);

        for (int jump = idx + 1; jump <= maxReach; jump++){
            if (jump < nums.length && memoization(nums, jump, dp)){
                dp[idx] = 1;
                return dp[idx] == 1;
            }
        }

        dp[idx] = 0;
        return false;

    }

    //approach-3
    //tc-o(n*n)
    private static boolean tabulation(int[] nums){
        int n = nums.length; 
        boolean[] dp = new boolean[n];
        dp[n - 1] = true;

        for (int i = n - 2; i >= 0; i--){
            if (nums[i] == 0){
                dp[i] = false;
                continue;
            }

            int maxReach = i + nums[i];
            for (int jump = i + 1; jump <= maxReach; jump++){
                if (jump < n && dp[jump]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }

}