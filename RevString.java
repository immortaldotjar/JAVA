import java.util.*;

class RevString {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Sentence: ");
        String str1 = sc.nextLine();

        String str2 = "", str3 = "";
        int i, j;
        char ch;
            
        str1 += " ";
        for (i = 0; i < str1.length(); i++) {
            ch =str1.charAt(i) ;

            if (ch != ' ') {
                str2 += ch;
            } else {
                str3 = "";
                for (j = str2.length() - 1; j >= 0; j--) {
                    str3 += str2.charAt(j);
                }
                System.out.println(str3 + " : " + str2.length());
                str2 = "";
            }
        }
    }
}
