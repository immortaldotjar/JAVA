import java.util.*;

class SNumArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        int i,s = 0;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("[ ");
        for(i = 0; i < n;i++){
            System.out.print(a[i]+",");
        }
        System.out.print(" ]");
        
        for(i = 0; i < n;i++){
            s += a[i];
        }
        
        System.out.println("\nSum of elements of array : "+s);
        
    }
}

