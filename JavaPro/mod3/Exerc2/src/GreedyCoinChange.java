import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyCoinChange {
    public static List<Integer> giveChange(int amount, int[] coins) {
        Arrays.sort(coins);
        List<Integer> usedCoins = new ArrayList<>();

        int index = coins.length - 1;
        while (amount > 0 && index >= 0) {
            if (coins[index] <= amount) {
                int numCoins = amount / coins[index];
                amount -= numCoins * coins[index];
                for (int i = 0; i < numCoins; i++) {
                    usedCoins.add(coins[index]);
                }
            }
            index--;
        }

        return usedCoins;
    }
}