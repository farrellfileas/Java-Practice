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
    /* Bool[][] checked
        for (int i = 0; grid.length; i++) {
            for (int j = )
        }

    dfs(i, j, Bool[][] checked)
    checked[i][j] = true;
    if (grid[i+1][j] == "1") {
        dfs(i+1, j, checked);
    }
    if (grid[i][j+1] == "1") {
        -----------------
    }
    */



    /**
     * @param grid the entire area where 1 represents land and 0 represents water
     * @return the number of islands in the grid
     */
    private static int numIslands(char[][] grid) {
        boolean[][] checked = new boolean[grid.length][grid[0].length];
        int result = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !checked[i][j]) {
                    result++;
                    dfs(i, j, checked, grid);
                }
            }
        }

        return result;
    }

    /*
    private static void dfs_iterative(int i, int j, boolean[][] checked, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        checked[i][j] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int[][] neighbours = getNeighbours(current);
            for (int[] neigh : neighbours) {
                queue.add(neigh);
                checked[neigh[0]][neigh[1]] = true;
            }
        }
    }
    */
    // DFS & BFS
    // --> Initialize the Queue/Stack
    // --> Add initial value into the DS
    // --> Action related to added value
    // --> While loop while DS isn't empty
    // ----> Current value is DS.pop/DS.poll
    // ----> Find and define neighbours of the current value
    // ----> Do for loop for every neighbour
    // -------> Put neighbour into DS
    // -------> Action related to added value

    private static void dfs(int i, int j, boolean[][] checked, char[][] grid) {
        checked[i][j] = true;
        if (i < grid.length - 1 && grid[i+1][j] == '1') {
            dfs(i+1, j, checked, grid);
        }
        if (j < grid[i].length - 1 && grid[i][j+1] == '1') {
            dfs(i, j+1, checked, grid);
        }
    }
}