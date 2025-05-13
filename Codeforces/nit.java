import java.util.*;

public class nit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    int n = sc.nextInt();
		    
		    int[] nums = new int[n];
		    
		    int cntZeros = 0;
		    for (int i = 0; i < n; i++) {
		        nums[i] = sc.nextInt();
		        if (nums[i] == 0) {
		            cntZeros++;
		        }
		    }
		    
		    int left = 0, right = n - 1;
		    
		    while (left < n && nums[left] == 0) left++;
		    while (right >= 0 && nums[right] == 0) right--;
		    
		    int foundZeros = 0;
		    for (int i = left; i <= right; i++) {
		        if (nums[i] == 0) {
		            foundZeros = 1;
		        }
		    }
		    
		    if (cntZeros == n) {
		        System.out.println(0);
		    }
		    else if (foundZeros == 0) {
		        System.out.println(1);
		    }
		    else {
		        System.out.println(2);
		    }
		}
        sc.close();
    }
}
