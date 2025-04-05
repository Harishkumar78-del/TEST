\\LONGESTDCCREASINGSUBSEQUENCE
public class LongestDecreasingSubsequence {

    public static int findLDS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];


        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }


        int max = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > max)
                max = dp[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 2, 5, 4, 3, 2};
        int result = findLDS(arr);
        System.out.println("Length of Longest Decreasing Subsequence: " + result);
    }
}

