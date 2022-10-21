import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme_8_AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the length of the triangle : ");
        int length = scanner.nextInt();
        System.out.println("Please Enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOfTriangle(length, height);
        scanner.close();

    }

    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The Area of a trinagle is : " + area);
    }
}
