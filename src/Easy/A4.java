package Easy;

public class A4 {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                }
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {

    }
}
