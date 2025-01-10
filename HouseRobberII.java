import java.util.ArrayList;

public class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
		if (n == 1){
			return nums[0];
		}
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < n; i++){
			if (i != 0) list1.add(nums[i]);
			if (i != n - 1) list2.add(nums[i]);
		}

		
        return Math.max(maximumNonAdjacentSum(list1), maximumNonAdjacentSum(list2));
    }

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
        if(nums == null || n == 0) {
            return 0;
        }
        if (n == 1){
            return (int)nums.get(0);
        }

        if (n == 2){
            return (int)Math.max(nums.get(0), nums.get(1));
        }

        int prev1 = nums.get(0);
        int prev2 = Integer.max(nums.get(1), nums.get(0));
        for(int i = 2; i < n; i++){
            int pick = nums.get(i) + prev1;
            int skip = prev2;
            
            int curr = Math.max(pick, skip);
            prev1 = prev2;
            prev2 = curr;
        }

        return prev2;
    }
}
