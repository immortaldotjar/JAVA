import java.util.*;

class OneDtoTwoD{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dimension of Array : ");
        int n = sc.nextInt();
        
        System.out.print("Enter the row dimension of Matrix-A : ");
        int r = sc.nextInt();
        System.out.print("Enter the column dimension of Matrix-A : ");
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];
        int arr[] = new int[n];
        int i,j,k = 0,large,small;
        
        for(i = 0; i < n;i++){
            System.out.print("Enter element of Array["+i+"] : ");
                arr[i] = sc.nextInt();
        }
        
        System.out.print("[");
        for(i = 0; i < n;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println("]\n");
        
        for(i = 0;i < r;i++){
            for(j = 0;j < c;j++){
                a[i][j] = arr[k];
                k++;
            }
        }
        
        for(i = 0; i < r;i++){
            System.out.print("[");
            for(j = 0 ;j < c;j++){
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.println("]");
        }
        
        
    }
}


