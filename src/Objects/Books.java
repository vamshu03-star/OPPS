package Objects;
import java.util.Scanner;
public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        System.out.print("Enter Book Name : ");
        b1.BookName=sc.next();
        System.out.print("Enter Book Id : ");
        b1.bookNumber=sc.nextInt();
        System.out.print("Enter Price of the Book : ");
        b1.price=sc.nextInt();
        System.out.println("Book Name = "+ b1.BookName);
        System.out.println("Book Id = "+ b1.bookNumber);
        System.out.print("Price of the book = "+ b1.price);
    }
}
class Book{
    String BookName;
    int price;
    int bookNumber;
}
