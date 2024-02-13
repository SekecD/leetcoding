package Medium;

import java.util.List;

public class A4 {
    public int maxLength(List<String> arr) {
        int[] dp = new int[1];
        backtrack(arr, 0, 0, dp);
        return dp[0];
    }

    private void backtrack(List<String> arr, int index, int bitmask, int[] dp) {
        int currentLength = countBits(bitmask);
        dp[0] = Math.max(dp[0], currentLength);

        for (int i = index; i < arr.size(); i++) {
            int newBitmask = bitmask;
            boolean isUnique = true;

            for (char c : arr.get(i).toCharArray()) {
                int bit = 1 << (c - 'a');
                if ((newBitmask & bit) != 0) {
                    isUnique = false;
                    break;
                }
                newBitmask |= bit;
            }
            if (isUnique) {
                backtrack(arr, i + 1, newBitmask, dp);
            }
        }
    }

    private int countBits(int bitmask) {
        int count = 0;
        while (bitmask != 0) {
            count++;
            bitmask &= bitmask - 1;
        }
        return count;
    }
}
