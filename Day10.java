import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        int[][] input = {
                                {2},
                               {3,4},
                              {6,5,7},
                             {4,1,8,3}
                        };
        
        // Expected 2 + 3 + 5 + 1 = 11
        System.out.println(minimumTotal(transform(input)));
        System.out.println(transform(input).toString());
    }

    private static int minimumTotal(List<List<Integer>> triangle) {
        return 0;
    }

    private static List<List<Integer>> transform(int[][] wall) {
        List<List<Integer>> lst = new ArrayList<>();
        
        for (int[] w : wall) {
            lst.add(new ArrayList<>());
            for (int i : w) {
                lst.get(lst.size() - 1).add(i);
            }
        }
        
        return lst;
    }
}
