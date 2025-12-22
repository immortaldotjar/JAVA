import java.util.*;

class splitArray{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of array : ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        int b[] = new int[n];
        int s[] = new int[n];
        
        int i,c = 0,d=0;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of s["+i+"] : ");
            s[i] = sc.nextInt();
            
        }
        
        for(i = 0; i < n;i++){
            if(s[i] % 2 == 0){
                a[c++] = s[i];
            }
            else{
                b[d++] = s[i];
            }
        }
        
        System.out.println("Split array : ");
        System.out.print("Array A : ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        
        System.out.print("\nArray B : ");
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}

