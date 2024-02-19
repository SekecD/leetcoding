package Hard;

import java.util.Map;
import java.util.TreeMap;

public class A3 {
    public int mostBooked(int n, int[][] meetings) {
        TreeMap<Integer, Integer> roomCount = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            roomCount.put(i ,0);
        }

        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];

            for (int j = start; j < end; j++) {
                roomCount.put(j, roomCount.getOrDefault(j, 0) + 1);
            }
        }

        int maxM = 0;
        int maxR = 0;
        for (Map.Entry<Integer, Integer> entry : roomCount.entrySet()) {
            if (entry.getValue() > maxM) {
                maxM = entry.getValue();
                maxR = entry.getKey();
            }
        }
        return maxR;
    }
}
