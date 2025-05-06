package Codeforces;

import java.util.*;

public class jel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long[] x = new long[(int)n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }
            long maximumTime = b;
            for (int i = 0; i < n; i++) {
                maximumTime += Math.min(x[i], a - 1);
            }
            System.out.println(maximumTime);
        }
        sc.close();
    }
}