/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {

    public static void main(String[] args) {

    }

    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, the value of the first variable is : " + a + " and second variable is :" + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, the value of first variable is :" + a + " and second variable is : " + b);
    }
}
