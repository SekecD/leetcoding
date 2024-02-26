package Medium;

public class A9 {
    public int rangeBitwiseAnd(int left, int right) {
        int m = Integer.MAX_VALUE;

        while ((left & m) != (right & m)) {
            m <<= 1;
        }
        return left & m;
    }

    public static void main(String[] args) {
        A9 a9 = new A9();

        int left1 = 5, right1 = 7;
        System.out.println(a9.rangeBitwiseAnd(left1, right1));

        int left2 = 0, right2 = 0;
        System.out.println(a9.rangeBitwiseAnd(left2, right2));

        int left3 = 1, right3 = 2147483647;
        System.out.println(a9.rangeBitwiseAnd(left3, right3));
    }
}
