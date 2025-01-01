public class MinCostTicket_983 {
    public static void main(String[] args) {
        int[] days = { 1, 4, 6, 7, 8, 20 };
        int[] costs = new int[] { 2, 7, 15 };
        int n = days.length;
        System.out.println(function(days, costs, n, 0));
    }
    //o(n)
    private static int function(int[] days, int[] costs, int n, int i) {
        if (i >= n){
            return 0;
        }

        int cost1 = costs[0] + function(days, costs, n, i + 1);

        int j = i;
        int maxDay = days[i] + 7;

        while(j < n && maxDay > days[j]) {
            j++;
        }
        int cost7 = costs[1] + function(days, costs, n, j);


        j = i;
        maxDay = days[i] + 30;

        while(j < n && maxDay > days[j]) {
            j++;
        }
        int cost30 = costs[2] + function(days, costs, n, j);
        
        return Math.min(cost1, Math.min(cost30, cost7));
    }
}
