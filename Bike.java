import java.util.*;

class Bike{
    int bno,phno,days,charge;
    String name;
    
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer's Name : ");
        name = sc.nextLine();
        
        System.out.print("Enter Customers's Phone Number : ");
        phno = sc.nextInt();
        
        System.out.print("Enter Bike Number : ");
        bno = sc.nextInt();
        
        System.out.print("Enter days for Rental : ");
        days = sc.nextInt();
    }
    
    void Compute(){
        if(days >= 1 && days <= 5){
            charge = days * 500;
        }
        else if(days >= 6 && days <=10){
            charge = 5 * 500 + (days - 5) * 400;
        }
        else{
            charge = 5 * 500 + 400 * 5 + (days - 10) * 200;
        }
    }
    
    void Display(){
        System.out.println("\nCustomer Details ->\n");
        System.out.println("Name : "+name);
        System.out.println("Phone Number : "+phno);
        System.out.println("Bike Number : "+bno);
        System.out.println("Days of Rental : "+days);
        System.out.println("Charge for Rental : "+charge);
    }
    
    public static void main(){
        Bike obj = new Bike();
        
        obj.Input();
        obj.Compute();
        obj.Display();
    }
}