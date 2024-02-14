package Medium;

import java.util.Arrays;

public class A5 {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = Arrays.stream(nums).filter(num -> num > 0).boxed().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();
        int[] negative = Arrays.stream(nums).filter(num -> num < 0).boxed().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();

        int[] rear = new int[nums.length];
        int index = 0;
        int i = 0, j = 0;

        while (i < positive.length && j < negative.length) {
            rear[index++] = positive[i++];
            rear[index++] =  negative[j++];
        }
        while (i < positive.length) {
            rear[index++] = positive[i++];
        }

        while (j < negative.length) {
            rear[index++] = negative[j++];
        }
        return rear;
    }
}
