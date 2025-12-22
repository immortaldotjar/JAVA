import java.util.*;

class ULSumofRDiag{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row dimension of Matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter the column dimension of Matrix : ");
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];
        
        int i,j,us = 0,ls = 0;
        
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
        
        for(i = 0; i < r;i++){
            for(j = 0 ;j < c;j++){
                if(i < j){
                    us += a[i][j];
                }
                if(i > j){
                    ls += a[i][j];
                }
            }
        }
        
        System.out.println("Sum of Upper Right Diagonal Elements : "+us);
        System.out.println("Sum of Lower Right Diagonal Elements : "+ls);
    }
}


