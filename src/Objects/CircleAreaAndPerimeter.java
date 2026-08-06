package Objects;
import java.util.Scanner;
public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.print("Enter Radius : ");
        radius = sc.nextInt();
        Circle c = new Circle();
        c.area = (Math.PI) * radius * radius;
        c.perimeter = 2*(Math.PI) * radius;
        System.out.println("Area of the Circle = " + c.area);
        System.out.println("Perimeter of the Circle = " + c.perimeter);

    }
}
class Circle{
    double area;
    double perimeter;
};
