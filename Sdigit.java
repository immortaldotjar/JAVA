//WAP to print the sum of the digits
import java.util.Scanner;

class Sdigit{

    public static void main(){

        int num,sum = 0,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num = sc.nextInt();

        int temp = num;
        while(temp != 0){
            a = temp % 10;
            sum += a;
            temp /= 10; 
        }

        System.out.println("Sum of digits : "+sum);

    }
}