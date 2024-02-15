package Medium;

import java.util.Arrays;

public class A6 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long curSum = 0;

        for (int i = n - 1; i >= 2; i--) {
            curSum += nums[i];
            if (curSum > nums[i - 1] + nums[i - 2]) {
                return curSum;
            }
        }
        return -1;
    }
}
