import java.util.*;

class BSortArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int i,j,temp;

        for (i = 0; i < n; i++) {
            System.out.print("Enter element a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        for(i = 0;i < n - 1;i++){
            for(j = 0;j < n - i - 1;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        System.out.print("Sorted Array : \n[ ");
        
        for(i = 0;i < n;i++){
            System.out.print(a[i]+" , ");
        }
        System.out.println("]");
    }
}
