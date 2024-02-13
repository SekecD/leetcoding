package Easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A5 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalinodrome(word.toCharArray(), 0, word.length() - 1)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalinodrome (char[] word, int left, int right) {
        while (left < right) {
            if (word[left] != word[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

