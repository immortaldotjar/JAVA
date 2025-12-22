import java.util.*;

class SSortArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int m = i; 
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[m]) { 
                    m = j;
                }
            }
            int temp = a[m];
            a[m] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
