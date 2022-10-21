/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {

    public static void areaAndPerimeter(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter pf the rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Emter the width of the rectangle: ");
        int height = scanner.nextInt();
    }

}
