package Medium;

import java.util.*;

public class A7 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>(frequencyMap.values());
        Collections.sort(freq);

        int u = frequencyMap.size();

        for (int frequency : freq) {
            if (k >= frequency) {
                k -= frequency;
                u--;
            } else {
                break;
            }
        }
        return u;
    }
}
