import java.util.*;

class mergeArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        int b[] = new int[n];
        int m[] = new int[n+n];
        
        int i,c = 0;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of a["+i+"] : ");
            a[i] = sc.nextInt();
            System.out.print("Enter element of b["+i+"] : ");
            b[i] = sc.nextInt();
        }
        
        for(i = 0; i < n;i++){
            m[c++] = a[i];
            m[c++] = b[i];
        }
        
        System.out.print("Merged array of A and B: ");
        for (i = 0; i < m.length; i++) {
            System.out.print(m[i] + ", ");
        }
    }
}

