import java.util.*;

public class chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            if (k > n) {
                System.out.println("NO");
                continue;
            }

            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            int oddCnt = 0;

            for (int num : freq) {
                if (num % 2 != 0) {
                    oddCnt++;
                }
            }

            if (oddCnt > k + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close(); 
    }
}
