import java.util.*;

class WordRepalce{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String str1 = sc.nextLine();
        
        String str2 = "";
        char ch;
        int i,len=str1.length();
        
        for(i = 0;i < len;i++){
            ch = str1.charAt(i);
            if(ch == 'Z'){
                str2 += 'A';
            }
            else if(ch == 'z'){
                str2 += 'a';
            }
            else{
                str2 += (char)(ch+1);
            }
        }
        System.out.println("\nOriginal Word : "+str1+"\nChanged Word : "+str2);
    }
}