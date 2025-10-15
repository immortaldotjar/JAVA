import java.util.*;

class PalinString{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        String str1 = "",str2 = "";
        
        int i,len;
        char ch;
        
        System.out.print("Enter Any Sentence : ");
        str1 = sc.nextLine();
        
        len = str1.length();
        
        for(i = len - 1;i >= 0;i--){
            ch = str1.charAt(i);
            str2 += ch;
        }
        
        System.out.println(str1);
        System.out.println(str2);
        
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(str1+" is Palindrome String!");
        }else{
            System.out.println(str1+" is not a Palindrome String!");
        }
    }
}