import java.util.*;

class compareNumber {
    void Compare(int a, int b) {
        int num = Math.max(a, b);
        System.out.println("Greatest Value : " + num);
    }

    void Compare(char c, char d) {
        int num = Math.max((int)c,(int)d);
        char ch = (char)num;
        System.out.println("Greatest Character : " + ch);
    }

    void Compare(String e, String f) {
        if (e.length() > f.length()) {
            System.out.println("Greatest String : " + e);
        } else {
            System.out.println("Greatest String : " + f);
        }
    }

    public static void main() {
        compareNumber obj = new compareNumber();
        Scanner sc = new Scanner(System.in);

        int a, b;
        char c, d;
        String e, f;

        System.out.print("Enter the First Value : ");
        a = sc.nextInt();
        System.out.print("Enter the Second Value : ");
        b = sc.nextInt();
        System.out.print("Enter the First Character : ");
        c = sc.next().charAt(0);
        System.out.print("Enter the Second Character : ");
        d = sc.next().charAt(0);

        sc.nextLine();
        System.out.print("Enter the First String : ");
        e = sc.nextLine();
        System.out.print("Enter the Second String : ");
        f = sc.nextLine();

        obj.Compare(a, b);
        obj.Compare(c, d);
        obj.Compare(e, f);
    }
}
