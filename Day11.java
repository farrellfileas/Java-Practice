import java.util.*;

public class Day11 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target).toString()); // Expected [[2,2,3],[7]]

        candidates = new int[]{2, 3, 5};
        target = 8;
        System.out.println(combinationSum(candidates, target).toString()); // Expected [[2,2,2,2],[2,3,3],[3,5]]

        candidates = new int[]{2};
        target = 1;
        System.out.println(combinationSum(candidates, target).toString()); // Expected []

        candidates = new int[]{1};
        target = 1;
        System.out.println(combinationSum(candidates, target).toString()); // Expected [[1]]
        
        candidates = new int[]{1};
        target = 2;
        System.out.println(combinationSum(candidates, target).toString()); // Expected [[1,1]]
        
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }
}
