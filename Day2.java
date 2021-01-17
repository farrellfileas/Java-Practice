import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        char[][] grid = {
                          {'1','1','1','1','0'},
                          {'1','1','0','1','0'},
                          {'1','1','0','0','0'},
                          {'0','0','0','0','0'}
                        };
        
        int result1 = numIslands(grid);
        
        // Expected 1
        System.out.println(result1);
        
        grid = new char[][]{
                    {'1','1','0','0','0'},
                    {'1','1','0','0','0'},
                    {'0','0','1','0','0'},
                    {'0','0','0','1','1'}
                };
        
        // Expected 3
        int result2 = numIslands(grid);
        
        System.out.println(result2);
                
    }

    /**
     * @param grid the entire area where 1 represents land and 0 represents water
     * @return the number of islands in the grid
     */
    private static int numIslands(char[][] grid) {
        return 0;
    }
}