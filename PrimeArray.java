import java.util.*;

class PrimeArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        int i,s = 0,c = 0;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        
        for(i = 0; i < n;i++){
            c = 0;
            int index = a[i];
            
            for(int j = 1; j <= a[i]; j++){
                if(index % j == 0){
                    c++;
                }
            }
            
            if(c == 2){
                s += index;
            }
        }
        
        System.out.println("Sum of Prime elements in the array : "+s);        
    }
}

