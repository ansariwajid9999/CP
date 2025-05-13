import java.util.Scanner;

public class avtobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            
            if (n < 4 || n % 2 != 0) {
                System.out.println("-1");
            } else {
                // Minimum buses = more 6-wheel buses → ceil(n / 6.0)
                long min_buses = (n + 5) / 6;
                // Maximum buses = more 4-wheel buses → n / 4
                long max_buses = n / 4;
                System.out.println(min_buses + " " + max_buses);
            }
        }
        sc.close();
    }
}
