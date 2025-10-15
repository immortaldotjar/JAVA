//WAP to check wheather the number is Emirp or not

import java.util.*;

class Emirp {
    public static void main() {
        int a, b, c, num;
        Emirp obj = new Emirp();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = sc.nextInt();
        
        a = obj.isPrime(num);
        b = obj.rev(num);
        c = obj.isPrime(b);

        if (a == 1 && c == 1) {
            System.out.println(num + " is Emirp Number!");
        } else {
            System.out.println(num + " is not Emirp Number!");
        }
    }

    int isPrime(int num) {
        int c = 0;
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                c++;
            }
        }

        if(c == 2){
            return 1;
        }
        else{
            return 0;
        }
    }

    int rev(int num) {
        int r, s = 0;
        while (num != 0) {
            r = num % 10;
            s = s * 10 + r;
            num /=10;
        }
        return s;
    }
}
