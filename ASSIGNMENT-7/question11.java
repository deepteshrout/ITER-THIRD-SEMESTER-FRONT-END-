
/*Write a Java program that reads an integer number and counts the number of digits that are even. */

import java.util.Scanner;
public class question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int evenCount = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            number /= 10;
        }
        System.out.println("Number of even digits: " + evenCount);
        scanner.close();
    }
}

/*import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = Math.abs(scanner.nextInt()), evenCount = 0;

        while (number > 0) {
            if ((number % 10) % 2 == 0) evenCount++; // Check if last digit is even
            number /= 10; // Remove the last digit
        }

        System.out.println("Number of even digits: " + evenCount);
        scanner.close();
    }
}
 */
