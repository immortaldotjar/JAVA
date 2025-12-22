import java.util.*;
class ULSumofLDiag{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row dimension of matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter the column dimension of matrix : ");
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
                if((i + j ) >= 0 && (i + j ) < 3){
                    us += a[i][j];
                }
                if((i + j ) >= 4 && (i + j ) <= 6){
                    ls += a[i][j];
                }
            }
        }
        
        System.out.println("Sum of Upper Left Diagonal Elements : "+us);
        System.out.println("Sum of Lower Left Diagonal Elements : "+ls);
    }
}


