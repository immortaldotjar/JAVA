import java.util.*;

class LSArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        int i,num,f = 0,pos = 0;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of a["+i+"] : ");
            a[i] = sc.nextInt();
        }        
        System.out.print("Enter Element to Search : ");
        num = sc.nextInt();
        
        for(i = 0; i < n;i++){
            if(a[i] == num){
                f++;
                pos = ++i;
                break;
            }
        }
        
        if(f == 1){
            System.out.println(num+" element found at position "+pos);
        }
        else{
            System.out.println(num+" element not found!");
        }
        
    }
}

