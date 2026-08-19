package Objects;
import java.util.Scanner;
class Book{
    String title,author,publisher;
    int year,isbn;
    double price;
    Book(){
        title = "";
        author = "";
        publisher = "";
        year = 0;
        isbn = 0;
        price = 0.0;
    }
    Book(String t,String a,String p,int y,int i,double pr){
        title = t;
        author = a;
        publisher = p;
        year = y;
        isbn = i;
        price = pr;
    }

    void display()
    {
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
        System.out.println("Publisher = "+publisher);
        System.out.println("Year = "+year);
        System.out.println("ISBN = "+isbn);
        System.out.println("Price = "+price);
    }
    void match(int key)
    {
        if(key==isbn)
        {
            System.out.println("Key matched and details of the book are :");
            display();
        }
    }
    void discount(int isb,int dis)
    {
      if(isb==isbn)
      {
          price = price - (price * dis/100);
          System.out.println("Book details after discount ");
          display();
      }
    }
}
public class BookDemo{
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book("Java","James","Sun",2000,123,299);
        b[1] = new Book("C","Hitler","Moon",2010,987,199);
        b[2] = new Book("Python","Stark","Sky",2020,567,99);
        for(int j=0;j<3;j++)
        {
            System.out.println("Details of Book "+(j+1));
            b[j].display();
        }
        System.out.println("Enter isbn of Book");
        Scanner sc = new Scanner(System.in);
        int key  = sc.nextInt();
        for(int k=0;k<3;k++)
        {
            b[k].match(key);
        }
        System.out.println("Enter isbn of book for discount : ");
        int isb = sc.nextInt();
        System.out.println("Enter discount percentage : ");
        int dis = sc.nextInt();
        for(int k=0;k<3;k++)
        {
            b[k].discount(isb,dis);
        }
    }
}
