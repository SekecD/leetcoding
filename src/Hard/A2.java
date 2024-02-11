package Hard;

import java.util.HashMap;
import java.util.Map;

public class A2 {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Map<String, Integer> memo = new HashMap<>();
        return cherryPickupcherryPickupRecursive(grid, rows, cols, 0, 0, cols - 1, memo);
    }

    private int cherryPickupcherryPickupRecursive(int[][] grid, int rows, int cols, int row, int col1,int col2, Map<String, Integer> memo) {
        if (row >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
            return 0;
        }

        String key = row + "_" + col1 + "_" + col2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int cherries = grid[row][col1] + (col1 != col2 ? grid[row][col2] : 0);

        int maxCherries = 0;
        for (int newCol1 = col1 - 1; newCol1 <= col1 + 1; newCol1++) {
            for (int newCol2 = col2 - 1; newCol2 <= col2 + 1; newCol2++) {
                maxCherries = Math.max(maxCherries, cherryPickupcherryPickupRecursive(grid, rows, cols, row + 1, newCol1, newCol2, memo));
            }
        }

        memo.put(key, cherries + maxCherries);

        return cherries + maxCherries;
    }
}
