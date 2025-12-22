import java.util.*;

class Consonants{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        String vowel = "aeiouAEIOU",str = "";
        
        int i,len,c=0;
        char ch;
        
        System.out.print("Enter Any Sentence : ");
        str = sc.nextLine();
        
        len = str.length();
        
        for(i = 0;i < len ;i++){
            ch = str.charAt(i);
            if(vowel.indexOf(ch) == -1){
                c++;
            }
        }
        
        System.out.println("Total Number of Consonants present in "+str+" : "+c);
    }
}