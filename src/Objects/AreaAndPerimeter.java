package Objects;
import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.println("Enter length and breadth");
        l = sc.nextInt();
        b = sc.nextInt();
        Rectangle r1= new Rectangle();
        r1.area = l*b;
        r1.perimeter = 2*(l+b);
        System.out.println("Area of Rectangle = " + r1.area);
        System.out.println("Perimeter of the Rectangle = " + r1.perimeter);
    }
}
class Rectangle{
    int area;
    int perimeter;
};
