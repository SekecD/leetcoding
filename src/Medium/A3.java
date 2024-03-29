package Medium;

public class A3 {
    public boolean winnerOfGame(String colors) {
        int aliceCount = 0;
        int bobCount = 0;

        for (int i = 0; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A') {
                aliceCount++;
            } else if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i - 1) == 'B'){
                bobCount++;
            }
        }

        return aliceCount > bobCount;
    }
}
