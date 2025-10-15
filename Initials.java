import java.util.*;

class Initials{
    void A_B_C(int len,String name,String x,String y){
        char ch;
        name += " "; 
        for(int i = 0;i <= len;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                y += x.charAt(0)+" ";
                x = "";
            }
        }
        System.out.println(y);
    }
    void AFull_B_C(int len,String name,String x,String y){
        char ch;
        name += " ";
        for(int i = 0;i <= len;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                if(y == ""){
                    y += x + " ";
                }else{
                    y += x.charAt(0) + " ";
                }
                x = "";
            }
        }
        System.out.println(y);
    }
    void A_BFull_C(int len,String name,String x,String y){
        char ch;
        for(int i = 0;i <= len-1;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                if(y != ""){
                    y += x + " ";
                }else{
                    y += x.charAt(0) + " ";
                }
                x = "";
            }
        }
        System.out.println(y+x.charAt(0));
    }
    void A_B_CFull(int len,String name,String x,String y){
        char ch;
        for(int i = 0;i <= len-1;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                y += x.charAt(0) + " ";
                x = "";
            }
        }
        System.out.println(y+x);
    }
    void AFull_B_CFull(int len,String name,String x,String y){
        char ch;
        name += " ";
        for(int i = 0;i <= len-1;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                if(y == ""){
                    y += x + " ";
                }else{
                    y += x.charAt(0)+ " ";
                }
                x = "";
            }
        }
        System.out.println(y+x);
    }
    void AFull_BFull_C(int len,String name,String x,String y){
        char ch;
        for(int i = 0;i <= len-1;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                y += x + " ";
                x = "";
            }
        }
        System.out.println(y+x.charAt(0));
    }
    void A_BFull_CFull(int len,String name,String x,String y){
        char ch;
        name += " ";
        for(int i = 0;i <= len;i++){
            ch = name.charAt(i);
            if(ch != ' '){
                x = x + ch;
            }
            else{
                x = x.trim();
                if(y != ""){
                    y += x + " " ;
                }else{
                    y += x.charAt(0)+ " ";
                }
                x = "";
            }
        }
        System.out.println(y);
    }
    public static void main(){
        Initials obj = new Initials();
        Scanner sc = new Scanner(System.in);
        String name,x = "",y = "";
        
        System.out.print("Enter Your name : ");
        name = sc.nextLine();
        int len = name.length();
        
        while(true){
            char ch;
            System.out.print("Do you want to enter the menu ? (Y/N) : ");
            ch = sc.next().charAt(0);
            if(ch == 'y'||ch == 'Y'){
                System.out.print("Enter the type of initial :\n1. A_B_C\n2. AFull_B_C\n3. A_BFull_C\n4. A_B_CFull\n5. AFull_B_CFull\n6. AFull_BFull_C\n7. A_BFull_CFull\n\nEnter Choice : ");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        obj.A_B_C(len,name,x,y);
                        break;
                    case 2:
                        obj.AFull_B_C(len,name,x,y);
                        break;
                    case 3:
                        obj.A_BFull_C(len,name,x,y);
                        break;
                    case 4:
                        obj.A_B_CFull(len,name,x,y);
                        break;
                    case 5:
                        obj.AFull_B_CFull(len,name,x,y);
                        break;
                    case 6:
                        obj.AFull_BFull_C(len,name,x,y);
                        break;
                    case 7:
                        obj.A_BFull_CFull(len,name,x,y);
                        break;
                    default:
                        System.out.println("Wrong choice!");
                }
            }
            else{
                System.out.println("Exiting menu!");
            }
        }
        
    }
}