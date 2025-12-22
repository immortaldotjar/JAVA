
import java.util.*;

class PrimePalindrome {

    boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        return c == 2;
    }

    boolean isPalin(int n) {
        int temp = n, sum = 0;
        while (temp != 0) {
            int a = temp % 10;
            sum = sum * 10 + a;
            temp /= 10;
        }

        return n == sum;
    }

    void showPalPrime(int a, int b) {

        System.out.println("All PrimePalindrome numbers from " + a + " - " + b + " :");
        for (int i = a; i <= b; i++) {
            if (isPalin(i) && isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main() {

        PrimePalindrome obj = new PrimePalindrome();
        int lLimit, uLimit;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Lower Limit  : ");
        lLimit = sc.nextInt();

        System.out.print("Enter Upper Limit : ");
        uLimit = sc.nextInt();

        obj.showPalPrime(lLimit, uLimit);

    }

}
