//WAP to check whether it is a Palindrome or not.

import java.util.*;

class Palindrome{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        int a,num,sum = 0;

        System.out.print("Enter the number : ");
        num = sc.nextInt();

        int temp = num;

        while(temp != 0){

            a = temp%10;
            sum = sum * 10 + a;
            temp /= 10;
        }

        if(num == sum){
            System.out.println(num+" is a Palindrome number!");
        }
        else{
            System.out.println(num+" is not a Palindrome number!");
        }
    }
}

