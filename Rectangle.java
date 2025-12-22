import java.util.*;

class Rectangle{
    
    int l,b;
    
    Rectangle(int  x,int y){
        l = x;
        b = y;
    }
    double AreaofRectangle(){
        return l * b;
    }
    double PerimeterofRectangle(){
        return 2*(l+b);
    }
    double DiagonalofRectangle(){
        return Math.sqrt(l*l+b*b);
    }
    
    public static void main(){
        int m,n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Length of Rectangle : ");
        m = sc.nextInt();
        
        System.out.print("Enter Breadth of Rectangle : ");
        n = sc.nextInt();
        
        Rectangle obj = new Rectangle(m,n);
        System.out.println("\nArea of Rectangle : "+ obj.AreaofRectangle());
        System.out.println("Perimeter of Rectangle : "+ obj.PerimeterofRectangle());
        System.out.println("Diagonal of Rectangle : "+ obj.DiagonalofRectangle());
    }
}