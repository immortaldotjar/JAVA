import java.util.*;

class BigSmallString {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Sentence: ");
        String str1 = sc.nextLine();

        String str2 = "",minStr = "",maxStr ="";
        int i, j;
        char ch;
            
        str1 += " ";
        for (i = 0; i < str1.length(); i++) {
            ch =str1.charAt(i) ;

            if (ch != ' ') {
                str2 += ch;
            } else {
                if(minStr.equals("") || minStr.length() > str2.length()){
                    minStr = str2;
                }
                
                if(maxStr.length() < str2.length()){
                    maxStr = str2;
                }
                
                str2 = "";
                
            }
        }
        System.out.println("Largest Word in the sentence : "+maxStr);
        System.out.println("Smallest Word in the sentence : "+minStr);
    }
}
