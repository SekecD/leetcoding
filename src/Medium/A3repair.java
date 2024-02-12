package Medium;
public class A3repair {
    public boolean winnerOfGames(String colors) {
        int aliceCount = 0;
        int bobCount = 0;
        int i = 1;

        while (i < colors.length() - 1) {
            int streak = 1;
            char color = colors.charAt(i);
            while (i < colors.length() - 1 && colors.charAt(i) == color) {
                streak++;
                i++;
            }
            if (color == 'A' && streak >= 3) {
                aliceCount += streak - 2;
            } else if (color == 'B' && streak >= 3) {
                bobCount += streak - 2;
            }
            i++;
        }
        return aliceCount > bobCount;
    }
}
