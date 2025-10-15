import java.util.*;

class greatComb{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n,temp1,temp2,temp3,a,great = 0,big,rev;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        
        temp1 = n;
        
        while(temp1 != 0){
            temp2 = temp3 = temp1;
            big = rev = 0;
            while(temp2 != 0){
                a = temp2 % 10;
                
                if(a > big){
                    big = a;
                }
                
                temp2 /= 10;
            }
            
            int c = 1,num = 0;
            
            while(temp3 != 0){
                a = temp3 % 10;
                
                if(a == big && c > 0){
                    c--;
                }
                else{
                    num = num * 10 + a;
                }
                
                temp3 /= 10;
            }
            
            great = great * 10 + big;
            
            while(num != 0){
                a = num % 10;
                rev = rev * 10 + a;
                num /= 10;
            }
            
            temp1 = rev;
        }
        
        System.out.println("Greatest combination of number "+n+" : "+great);
    }
}