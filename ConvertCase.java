import java.util.*;

class ConvertCase{
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        
        String str1 , str2 = "";
        char ch;
        int i,len;
        
        System.out.print("Enter Any Sentence : ");
        str1 = sc.nextLine();
        
        len = str1.length();
        
        for(i = 0;i < len;i++){
            ch = str1.charAt(i);
            if(Character.isUpperCase(ch)){
                str2 += Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                str2 += Character.toUpperCase(ch);
            }
            else{
                str2 += ch;
            }
        }
        System.out.println("\nOriginal Sentence : "+str1);
        System.out.println("Changed Sentence : "+str2);
    }
}