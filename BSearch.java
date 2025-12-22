import java.util.*;

class BSearch {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int i,num, f = 0,l = 0, u = n,midIndex;

        for (i = 0; i < n; i++) {
            System.out.print("Enter element a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        num = sc.nextInt();

        while(l <= u){
            midIndex = (l + u)/2;
            if(a[midIndex] == num){
                f = 1;
                break;
            }
            else if(num > a[midIndex]){
                l = midIndex + 1;
            }
            else if(num < a[midIndex]){
                u = midIndex - 1;
            }
        }

        if(f == 1){
            System.out.println(num+" element found !");
        }
        else{
            System.out.println(num+" element not found!");
        }
    }
}
