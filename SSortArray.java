import java.util.*;

class SSortArray{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array: ");
        int n = sc.nextInt();

        int[] a = new int[5];

        int m = 0,temp;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[m]) {
                    m = j;
                }
            }
            temp = a[m];
            a[m] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}