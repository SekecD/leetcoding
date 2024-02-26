package Hard;

import java.util.*;

public class A4 {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Map<Integer, Set<Integer>> sr = new HashMap<>();

        sr.put(0, new HashSet<>(Collections.singletonList(firstPerson)));
        sr.put(firstPerson, new HashSet<>(Collections.singletonList(0)));

        for (int[] meeting : meetings) {
            int p1 = meeting[0];
            int p2 = meeting[1];

            Set<Integer> sr1 = sr.getOrDefault(p1, new HashSet<>());
            Set<Integer> sr2 = sr.getOrDefault(p2, new HashSet<>());

            sr1.add(p2);
            sr2.add(p1);

            sr.put(p1, sr1);
            sr.put(p2, sr2);

        }

        for (int[] meeting : meetings) {
            int p1 = meeting[0];
            int p2 = meeting[1];

            Set<Integer> sr1 = sr.get(p1);
            Set<Integer> sr2 = sr.get(p2);

            sr1.addAll(sr2);
            sr2.addAll(sr1);

            sr.put(p1, sr1);
            sr.put(p2, sr2);

        }

        Set<Integer> result = sr.get(0);

        return new ArrayList<>(result);

    }
}
