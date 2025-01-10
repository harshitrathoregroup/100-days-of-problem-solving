import java.util.*;

public class HouseRobber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 4, 9));
        System.out.println(maximumNonAdjacentSum(nums));
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int[] dp = new int[nums.size()];
        Arrays.fill(dp, -1);
        return function(nums, 0, dp);
    }

    public static int function(ArrayList<Integer> nums, int idx, int[] dp) {
        if (idx >= nums.size()) {
            return 0;
        }
        if (dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums.get(idx) + function(nums, idx + 2, dp);
        
        int skip = function(nums, idx + 1, dp);
        
        return dp[idx] = Math.max(pick, skip);
    }
}
