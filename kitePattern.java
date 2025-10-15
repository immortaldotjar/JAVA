//WAP to print a kite pattern

import java.util.*;

class kitePattern{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        int num,i,j,k;

        System.out.print("Enter the number : ");
        num = sc.nextInt();

        for(i = 1 ;i <= num ;i++){
            for(j = 1 ;j <= num-i;j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(i = num-1 ;i >= 1 ; i--){
            for(j = 1; j <= num-i;j++){
                System.out.print(" ");
            }
            for(k = 1; k <= i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}