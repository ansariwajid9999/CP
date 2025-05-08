import java.util.*;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            long longest_substring_length = 1;
            long current_substring_length = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    current_substring_length++;
                }
                else {
                    longest_substring_length = Math.max(longest_substring_length, current_substring_length);
                    current_substring_length = 1;
                }
            }
            longest_substring_length = Math.max(longest_substring_length, current_substring_length);

            System.out.println(longest_substring_length + 1);
        }
        sc.close();
    }
}
