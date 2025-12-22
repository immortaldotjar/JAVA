import java.util.*;

class SumColMatrix{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row dimension of array : ");
        int r = sc.nextInt();
        System.out.print("Enter the column dimension of array : ");
        int c = sc.nextInt();
        
        int a[][] = new int[4][4];
        
        int i,j,s = 0,col=1;
        
        for(i = 0; i < r;i++){
            for(j = 0 ;j < c;j++){
                System.out.print("Enter element of a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        
        for(i = 0; i < r;i++){
            System.out.print("[");
            for(j = 0 ;j < c;j++){
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.println("]");
        }
        
        System.out.println("Sum of Column elements of Matrix : ");
        for(i = 0; i < r;i++){
            s = 0;
            for(j = 0 ;j < c;j++){
                s += a[j][i];
            }
            System.out.println("Sum of Column "+(col++)+" : "+s);
        }
    }
}


