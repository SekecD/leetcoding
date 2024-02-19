package Medium;

import java.util.PriorityQueue;

public class A8 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int b = heights.length;


        for (int i = 0; i < b - 1; i++) {
            int d = heights[i + 1] - heights[i];
            if (d > 0){
                minHeap.offer(d);
                if (minHeap.size() > ladders) {
                    bricks -= minHeap.poll();
                    if (bricks < 0) {
                        return i;
                    }
                }

            }
        }
        return heights.length - 1;
    }
}
