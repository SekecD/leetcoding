package Hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class A1 {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int targetMask = (1 << n) - 1;

        int[][] dp = new int[n][1 << n];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][1 << i] = 0;
            queue.offer(new int[]{
                    i, 1 << i
            });
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int state = curr[1];
            int dist = dp[node][state];

            if (state == targetMask) {
                return dist;
            }

            for (int next : graph[node]) {
                int nextState = state | (1 << next);

                if (dist + 1 < dp[next][nextState]) {
                    dp[next][nextState] = dist + 1;
                    queue.offer(new int[]{
                       next, nextState
                    });
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2, 3}, {0}, {0}, {0}};
        A1 a1 = new A1();
        int shortestPathLength = a1.shortestPathLength(graph);
        System.out.println(shortestPathLength);
    }
}
