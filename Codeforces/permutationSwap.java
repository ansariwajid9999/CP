import java.util.*;

public class permutationSwap {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int[] nums = new int[n];
		    
		    for (int i = 0; i < n; i++) {
		        nums[i] = sc.nextInt();
		    }
		    
		    int k = Math.abs(nums[0] - 1);
		    
		    for (int i = 1; i < n; i++) {
		        k = gcd(k, Math.abs(nums[i] - (i + 1)));
		    }
		    
		    System.out.println(k);
		}
        sc.close();
    }
}
