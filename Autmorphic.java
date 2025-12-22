//WAP to check the number is an Automorphic number or not

import java.util.*;

class Autmorphic{
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int sq,num,count = 0,a,b;

        System.out.println("Enter the number : ");
        num = sc.nextInt();

        sq = num*num;
        System.out.println(sq+" is the Square of "+num);
        int temp = num;

        while(temp != 0){
            
            count++;
            temp /= 10;
        }

        a = (int) Math.pow(10, count);
        b = sq % a;

        if (b == num){
            System.out.println(num+" is an Automorphic Number!");
        }
        else{
            System.out.println(num+" is not an Automorphic Number!");
        }
    }
}