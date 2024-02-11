package Easy;

public class A2 {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }

            tPointer++;

        }

        return sPointer == s.length();

    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";
        String t2 = "ahbgdc";

        A2 a2 = new A2();
        boolean isSubsequence1 = a2.isSubsequence(s1, t1);
        boolean isSubsequence2 = a2.isSubsequence(s2, t2);

        System.out.println(isSubsequence1);
        System.out.println(isSubsequence2);
    }
}
