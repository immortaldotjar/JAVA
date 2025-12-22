import java.util.*;

class middleDigit{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        
        int count = 0,a,b=0,temp1 = n,temp2 = n;
        
        while (temp1 != 0){
            count++;
            temp1 /= 10;
        }
        
        if(count % 2 != 0){
            a = count/2;
            
            while(b < a){
                
                temp2 /= 10;
                b++;
            }
            b = temp2 % 10;
            System.out.println("The Middle Digit of "+n+" : "+b);
        }
        else{
            System.out.println(n+" is a Even digit Number!,\nPlease enter number having odd number of digit");
        }
    }
}