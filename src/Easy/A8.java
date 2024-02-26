package Easy;

public class A8 {
    public int findJudge(int n, int[][] trust) {
        int[] od = new int[n + 1];
        int[] os = new int[n + 1];

        for (int[] rl : trust) {
            od[rl[0]]++;
            os[rl[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (od[i] == 0 && os[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        A8 a8 = new A8();

        int n1 = 2;
        int[][] tr1 = {{1, 2}};


        int n2 = 3;
        int[][] tr2 = {{1, 3}, {2, 3}};


        int n3 = 3;
    }
}
