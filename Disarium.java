//WAP to check whether the number is Disarium or not

import java.util.*;

class Disarium{

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a,num,sum = 0,count = 0,temp1,temp2;
        
        System.out.print("Enter the number : ");
        num = sc.nextInt();

        temp1 = temp2 = num;

        while(temp1 != 0){
            count++;
            temp1 /= 10;
        }

        while(temp2 != 0){
            a = temp2 % 10;
            sum += Math.pow(a, count);
            count--;
            temp2 /= 10;
        }

        if(sum == num){
            System.out.println(num+" is a Disarium Number");
        }
        else{
            System.out.println(num+" is not a Disarium Number");
        }
    }
}