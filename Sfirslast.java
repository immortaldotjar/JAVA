// WAP to sum up the first and last digit of the number

import java.util.*;

class Sfirslast{

    public static void main(){

        int num,a,sum = 0,b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        num = sc.nextInt();

        int temp = num;

        a = temp % 10;

        while(temp != 0){
            b = temp % 10;
            temp /= 10;
        }
        sum = a + b;

        System.out.println("Sum of First and Last Digit of "+num+" : "+sum);
    }
}