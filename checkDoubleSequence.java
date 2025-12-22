import java.util.*;

class checkDoubleSequence{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        String str;
        int i,c = 0,len;
        
        System.out.print("Enter Any Sentence : ");
        str = sc.nextLine();
        
        len = str.length();
        
        for(i = 0;i <= len - 2;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                c++;
            }
            
        }
        System.out.println("Number of Double Sequence characters : "+c);
    }
}