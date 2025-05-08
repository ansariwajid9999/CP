import java.util.*;

public class balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] nums = new Integer[n]; 

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Merge sort (guaranteed O(n log n))
            Arrays.sort(nums, Comparator.naturalOrder());

            int maxLen = 1, currentLen = 1;

            for (int i = 1; i < n; i++) {
                if (nums[i] - nums[i - 1] <= k) {
                    currentLen++;
                } else {
                    maxLen = Math.max(maxLen, currentLen);
                    currentLen = 1;
                }
            }

            maxLen = Math.max(maxLen, currentLen); 

            System.out.println(n - maxLen); 
        }

        sc.close();
    }
}
