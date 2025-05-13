import java.util.*;

public class mainak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int ans = nums[n - 1] - nums[0];
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, (nums[i] - nums[0]));
            }
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, (nums[n - 1] - nums[i]));
            }
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, (nums[i] - nums[i + 1]));
            }

            System.out.println(ans);
        }
        sc.close();
    }
}