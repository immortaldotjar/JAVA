import java.util.*;

class Draw{
    void printLine(){
        for(int i = 1;i <= 30;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    void printLine(int n){
        for(int i = 1;i <= n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    void printLine(int n, char ch){
        for(int i = 1;i <= n;i++){
            System.out.print(ch);
        }
        System.out.println();
    }
    
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        Draw obj = new Draw();
        int n;
        char ch;
        
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        
        System.out.print("Enter the character : ");
        ch = sc.next().charAt(0);
        
        obj.printLine();
        obj.printLine(n);
        obj.printLine(n,ch);
    }
}