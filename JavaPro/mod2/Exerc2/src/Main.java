public class Main {

    static int[] memo;

    public static int fatorialTop(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = n * fatorialTop(n - 1);
        return memo[n];
    }

    public static int fatorialBottom(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 30;
        memo = new int[n + 1];
        System.out.println("Fatorial Top de " + n + ": " + fatorialTop(n));

        System.out.println("Fatorial Botton de " + n + ": " + fatorialBottom(n));
    }
}
