import java.util.*;

class SInnerExcBound{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row dimension of array : ");
        int r = sc.nextInt();
        System.out.print("Enter the column dimension of array : ");
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];
        
        int i,j,s = 0;
        
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
                if(i != 0 && i != r - 1 && j != 0 && j != c - 1){
                    s += a[i][j];
                }
                
            }
        }
        
        System.out.println("Sum of Inner Elements Except Boundary Elements : "+s);
        
    }
}