import java.util.*;

public class oddQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            int[] nums = new int[n];
            long total = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                total += nums[i];
            }
            
            // Prefix sum for fast subarray sum calculation
            long[] prefix = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + nums[i - 1];
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                
                long originalSum = prefix[r] - prefix[l - 1];
                long newSum = (long)(r - l + 1) * k;
                long newTotal = total - originalSum + newSum;

                System.out.println((newTotal % 2 != 0) ? "YES" : "NO");
            }
        }
        sc.close();
    }
}
