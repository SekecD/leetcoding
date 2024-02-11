package Easy;

public class A3 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                word.insert(0, c);
            } else {
                result.append(word).append(' ');
                word.setLength(0);
            }
        }

        result.append(word);

        return result.toString();
    }
}
