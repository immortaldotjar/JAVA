import java.util.*;

class BinToDeci{
    public static void main(){
        int s = 0,c = 0,a,n,temp;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        n = sc.nextInt();
        
        temp = n;
        
        while(temp != 0){
            a = temp % 10;
            temp /= 10;
            s = s + a * (int)(Math.pow(2,c++));
        }
        
        System.out.println("Decimal of "+n+" : "+s);
        
    }
}