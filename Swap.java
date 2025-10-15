import java.util.*;

class Swap{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the First Value : ");
        a = sc.nextInt();
        
        System.out.print("Enter the Second Value : ");
        b = sc.nextInt();
        
        System.out.println("\nBefore Swapping : ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nAfter Swapping : ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
}