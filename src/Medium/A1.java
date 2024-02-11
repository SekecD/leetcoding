package Medium;

public class A1 {
    public int countSubstrings(String s) {
        int count = 0;

        if (s == null || s.length() == 0) {
            return count;
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            count++;
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }

            left = i;
            right = i + 1;


            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            }

        return count;
    }

    public static void main(String[] args) {
        String s = "aaa";
        A1 a1 = new A1();
        int count = a1.countSubstrings(s);
        System.out.println(count);
    }
}
