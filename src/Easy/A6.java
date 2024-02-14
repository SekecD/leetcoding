package Easy;

public class A6 {

    public boolean isMonotonic(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];


        if (first <= last) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}