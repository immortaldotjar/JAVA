import java.util.*;

class DeciToBin {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int a[] = new int[10];
        int i,c = 0;

        int temp = num;
        while (temp != 0) {
            a[c++] = temp % 2;
            temp /= 2;
            
        }
        
        System.out.print("Binary digits of "+num+" : [");
        
        for (i = c - 1; i >= 0; i--) {
            System.out.print(a[i]+" , ");
        }
        System.out.println("]");
    }
}
