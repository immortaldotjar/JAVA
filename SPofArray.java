import java.util.*;

class SPofArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        int i,s = 0,p = 1;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        
        for(i = 0; i < n;i++){
            if(a[i] % 2 == 0){
                s += a[i];
            }
            else{
                p *= a[i];
            }
        }
        
        System.out.println("Sum of Even elements of array : "+s);
        System.out.println("Product of Odd elements of array : "+p);
        
    }
}

