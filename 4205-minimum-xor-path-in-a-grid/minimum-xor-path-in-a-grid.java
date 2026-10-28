
import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int K = 1024;

        BitSet[] dp = new BitSet[n];

        for (int j = 0; j < n; j++) {
            dp[j] = new BitSet(K);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                BitSet cur = new BitSet(K);

                if (i == 0 && j == 0) {
                    cur.set(grid[i][j]);
                } else {
                    int v = grid[i][j];

                    // From the cell above
                    if (i > 0) {
                        for (int x = dp[j].nextSetBit(0);
                             x >= 0;
                             x = dp[j].nextSetBit(x + 1)) {
                            cur.set(x ^ v);
                        }
                    }

                    // From the cell on the left
                    if (j > 0) {
                        for (int x = dp[j - 1].nextSetBit(0);
                             x >= 0;
                             x = dp[j - 1].nextSetBit(x + 1)) {
                            cur.set(x ^ v);
                        }
                    }
                }

                dp[j] = cur;
            }
        }

        // Find minimum reachable XOR
        return dp[n - 1].nextSetBit(0);
    }
}
