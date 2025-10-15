import java.util.*;

class FreArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int i,num, f = 0;

        for (i = 0; i < n; i++) {
            System.out.print("Enter element a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        num = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == num) {
                f++;
            }
        }

        System.out.println("Frequency of element " + num + " : " + f);
    }
}
