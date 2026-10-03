class Solution {
    public int count(String num1, String num2, int min_sum, int max_sum) {
        long right = countTill(num2, min_sum, max_sum);
        long left = countTill(num1, min_sum, max_sum);

        long ans = (right - left + 1_000_000_007) % 1_000_000_007;
        int num1Sum = 0;
        for (int i = 0; i < num1.length(); i++) {
            num1Sum += num1.charAt(i) - '0';
        }

        if (num1Sum >= min_sum && num1Sum <= max_sum) {
            ans = (ans + 1) % 1_000_000_007;
        }

        return (int) ans;
    }

    int countTill(String limit, int min_sum, int max_sum) {
        int n = limit.length();
        int[][][] dp = new int[n + 1][max_sum + 1][2];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= max_sum; j++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return helper(limit, 0, 0, 1, min_sum, max_sum, dp);
    }

    int helper(String limit, int i, int curr_digit_sum, int restricted, int min_sum, int max_sum, int[][][] dp) {
        if (curr_digit_sum > max_sum) {
            return 0;
        }
        if (i >= limit.length()) {
            if (curr_digit_sum >= min_sum && curr_digit_sum <= max_sum) return 1;
            else return 0;
        }

        if (dp[i][curr_digit_sum][restricted] != -1) {
            return dp[i][curr_digit_sum][restricted];
        }

        int mxdigit = (restricted == 0) ? 9 : (limit.charAt(i) - '0');
        long total = 0;

        for (int d = 0; d <= mxdigit; d++) {
            int next_restricted = 0;
            if (restricted == 1) {
                if (d == mxdigit) next_restricted = 1;
            }
            total = (total + helper(limit, i + 1, curr_digit_sum + d, next_restricted, min_sum, max_sum, dp)) % 1_000_000_007;
        }

        return dp[i][curr_digit_sum][restricted] = (int) total;
    }
}