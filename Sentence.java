import java.util.*;

class Sentence{
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        
        String str;
        char ch;
        int i,uc = 0,lc = 0,dc = 0,scharc = 0,wh = 0,len;
        
        System.out.print("Enter Any Sentence : ");
        str = sc.nextLine();
        
        len = str.length();
        
        for(i = 0;i < len;i++){
            ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uc++;
            }
            else if(Character.isLowerCase(ch)){
                lc++;
            }
            else if(Character.isDigit(ch)){
                dc++;
            }
            else if(Character.isWhitespace(ch)){
                wh++;
            }
            else{
                scharc++;
            }
        }
        
        System.out.println("\nSentence : "+str);
            
        System.out.println("Upper Case Letters : "+uc);
        System.out.println("Lower Case Letters : "+lc);
        System.out.println("Digits : "+dc);
        System.out.println("White Spaces : "+wh);
        System.out.println("Special Characters : "+scharc);
        System.out.println("Words : "+(wh+1));
        System.out.println("Lenght of the Sentence : "+len);
    }
}