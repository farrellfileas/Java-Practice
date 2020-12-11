import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        int[][] costs = {{17,2,17},{16,16,5},{14,3,19}};
        System.out.println(minCost2(costs)); // Expected 10

        costs = new int[][]{};
        System.out.println(minCost(costs)); // Expected 0

        costs = new int[][]{{7, 6, 2}};
        System.out.println(minCost(costs)); // Expected 2

    }
    
    /*
    dp[i][j] = minimum cost up to i'th house if i'th house is colored j
    dp[i][j] = costs[i][j] + min(dp[i-1][j']) where j' != j
    dp[0][j] = costs[0][j]
    min(dp[n][j]) = solution where n is costs.length
    */

    private static int minCost(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }
        int case0 = costs[0][0];
        int case1 = costs[0][1];
        int case2 = costs[0][2];

        for (int i = 1; i < costs.length; i++) {
            int temp0 = case0;
            int temp1 = case1;
            case0 = Math.min(case1, case2) + costs[i][0];
            case1 = Math.min(temp0, case2) + costs[i][1];
            case2 = Math.min(temp0, temp1) + costs[i][2];
        }

        int result = Math.min(case0, case1);
        result = Math.min(result, case2);
        return result;
    }

    private static Integer dp[][];
    private static int minCost2(int[][] costs) {
        dp = new Integer[costs.length][3];
        int min = Math.min(helper(costs, 0, 0), helper(costs, 0, 1));
        return Math.min(min, helper(costs, 0, 2));
    }

    private static int helper(int[][] costs, int i, int j) {
        if (i == costs.length) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.remove(j);
        int min = Integer.MAX_VALUE;
        for (int n : set) {
            min = Math.min(min, helper(costs, i + 1, n));
        }
        dp[i][j] = min + costs[i][j];
        return min + costs[i][j];
    }
}
