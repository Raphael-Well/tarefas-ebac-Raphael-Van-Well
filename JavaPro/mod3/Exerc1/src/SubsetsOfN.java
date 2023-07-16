import java.util.ArrayList;
import java.util.List;

public class SubsetsOfN {
    public static List<List<Integer>> findSubsets(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        backtrack(S, n, 0, currentSubset, result);
        return result;
    }

    private static void backtrack(int[] S, int n, int start, List<Integer> currentSubset, List<List<Integer>> result) {
        if (currentSubset.size() == n) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        for (int i = start; i < S.length; i++) {
            currentSubset.add(S[i]);
            backtrack(S, n, i + 1, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}


