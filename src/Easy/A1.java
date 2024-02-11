package Easy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class A1 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        });

        for (int i = 0; i < m; i++) {
            int count = countSoldiers(mat[i]);

            pq.offer(new int[]{i, count});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        int index = k - 1;

        while (!pq.isEmpty()) {
            result[index] = pq.poll()[0];
            index--;
        }
        return result;
    }

    private int countSoldiers(int[] row) {
        int count = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0 ,0},
                {1, 1, 1, 1 ,0},
                {1, 0, 0, 0 ,0},
                {1, 1, 0, 0 ,0},
                {1, 1, 1, 1 ,1},
        };
        int k = 3;

        A1 a1 = new A1();
        int[] weakestRows = a1.kWeakestRows(mat, k);

        System.out.println(Arrays.toString(weakestRows));
    }
}

