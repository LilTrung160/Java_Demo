import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = sc.nextFloat();
        System.out.println("Enter the height of the rectangle: ");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
