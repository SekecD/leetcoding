package Easy;

public class A7 {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int xorR = 0;
        for (int i = 0; i < n; i++) {
            xorR ^= i ^ nums[i];
        }

        xorR ^= n;

        return xorR;
    }

    public static void main(String[] args) {
        A7 a7 = new A7();

        int[] nums1 = {3, 0, 1};
    }
}
