import java.util.*;

class Perfect{
    void Input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any Value : ");
        int n = sc.nextInt();
        
        Check(n);
    }
    
    int Sum(int a){
        int i,sum = 0;
        for(i = 1;i <= a;i++){
            if(a % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    void Check(int b){
        if(Sum(b)-b == b){
            System.out.println(b+" is a Perfect Number!");
        }
        else{
            System.out.println(b+" is not a Perfect Number!");
        }
    }
    
    public static void main(){
        Perfect obj = new Perfect();
        
        obj.Input();
    }
}