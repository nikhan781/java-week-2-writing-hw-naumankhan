/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class Programme_10_MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        multiplication(number);
        scanner.close();

    }

    public static void multiplication(int number) {
        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number));
        System.out.println(number + " x " + 3 + " = " + (number));
        System.out.println(number + " x " + 4 + " = " + (number));
        System.out.println(number + " x " + 5 + " = " + (number));
        System.out.println(number + " x " + 8 + " = " + (number));
        System.out.println(number + " x " + 9 + " = " + (number));
        System.out.println(number + " x " + 10 + " = " + (number));
    }
}
