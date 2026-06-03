import java.util.Arrays;
import java.util.Scanner;

public class TestCustom {
    static class AmountException extends Exception {
        public AmountException() {
            super("Invalid Amount");
        }
    }
    static class CoinChangeDP {
        public static int denom(int[] coins, int amt) {
            int size = amt + 1;
            int[] dp = new int[size];
            Arrays.fill(dp, size);
            dp[0] = 0;
            for (int coin : coins) {
                for (int i = coin; i <= amt; i++) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
            return (dp[amt] < size) ? dp[amt] : -1;
        }
    }
    public static void main(String[] args) throws AmountException {

        int[] currency = {200, 100, 500};
        int amt = 1250;
        Scanner scanner = new Scanner(System.in);
        try {
            int received = CoinChangeDP.denom(currency, amt);
            if (received == -1)
                throw new AmountException();
            System.out.println(received);
        } catch (AmountException am) {
            am.printStackTrace();
            System.out.println("Enter the amount only in 500, 200, 100");
            amt = scanner.nextInt();
            int received = CoinChangeDP.denom(currency, amt);
            if (received == -1)
                throw new AmountException();
            System.out.println(received);
        }
        scanner.close();
    }
}