public class Day6 {
    public static void main(String[] args) {
        int[][] costs = {{17,2,17},{16,16,5},{14,3,19}};
        System.out.println(minCost(costs)); // Expected 10

        costs = new int[][]{};
        System.out.println(minCost(costs)); // Expected 0

        costs = new int[][]{{7, 6, 2}};
        System.out.println(minCost(costs)); // Expected 2

    }
    
    private static int minCost(int[][] costs) {
        return 0;
    }
}
