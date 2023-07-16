import java.util.List;

public class Main {
    public static void main(String[] args) {
        int amount = 18;
        int[] coins = {5, 2, 1};

        List<Integer> change = GreedyCoinChange.giveChange(amount, coins);
        System.out.println("Saída: " + change);
    }
}
