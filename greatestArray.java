import java.util.*;

class greatestArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        int i;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        
        int great = a[0];
        
        for(i = 0; i < n;i++){
            if(great < a[i]){
                great = a[i];
            }
        }
        
        System.out.println("Greatest element of Array : "+great);
        
    }
}

