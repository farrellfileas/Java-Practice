import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        List<List<Integer>> wall = transform(new int[][]{{1,2,2,1},
                                                        {3,1,2},
                                                        {1,3,2},
                                                        {2,4},  
                                                        {3,1,2},
                                                        {1,3,1,1}});
        
        int result = leastBricks(wall);
        
        // Expected 2
        System.out.println(result);
    }
    
    /**
     * @param wall list of bricks that make up the wall
     * @return the least amount of bricks needed to be removed to pass the wall
     */
    private static int leastBricks(List<List<Integer>> wall) {  
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