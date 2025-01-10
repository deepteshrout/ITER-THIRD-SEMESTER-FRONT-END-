import java.util.Scanner;

public class question10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();
        final float EPSILON = 0.0001f;

       float difference = Math.abs(num1 - num2);

        if (difference < EPSILON) {
            System.out.println("The difference between the two numbers is less than " + EPSILON);
        } else {
            System.out.println("The difference between the two numbers is greater than or equal to " + EPSILON);
        }
        scanner.close();
    }
}
