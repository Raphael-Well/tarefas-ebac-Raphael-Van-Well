import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subsets = SubsetsOfN.findSubsets(S, n);

        System.out.println("Subsets de tamanho " + n + " do conjunto S: ");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}