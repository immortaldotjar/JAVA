
import java.util.Scanner;

class Library {

    int acNum, days, fine, returnDate;
    String title, author;

    void Input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Title of the Book : ");
        title = sc.nextLine();
        System.out.print("Enter the Author of the Book : ");
        author = sc.nextLine();
        System.out.print("Enter the Accession Number of the Book : ");
        acNum = sc.nextInt();
        System.out.print("Enter the Returning date of the Book : ");
        returnDate = sc.nextInt();
    }

    void Compute() {
        if (returnDate > 7) {
            days = returnDate - 7;
            fine = days* 2;
        }
    }

    void Display() {
        System.out.println("\nDetails ->");
        System.out.println("Title of the Book : " + title);
        System.out.println("Author of the Book : " + author);
        System.out.println("Accesion Number of the Book : " + acNum);
        System.out.println("Days of rental : " + returnDate);
        System.out.println("Fine charges : Rs. " + fine);
    }

    public static void main() {
        Library obj = new Library();

        obj.Input();
        obj.Compute();
        obj.Display();
    }
}
