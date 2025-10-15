//WAP to print even numbers between 1 to 100

import java.util.*;

class even {
    
    public static void main(){
        int a,c=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");

        a = sc.nextInt();

        System.out.println("Even numbers are : ");
        for(int i = 0;i <= a;i++){
            if( i % 2 == 0){
                System.out.print(i+", ");
                if(c == 5){
                    System.out.println();
                    c = 0;
                }
                c++;
            }
        }System.out.println();
    }
}