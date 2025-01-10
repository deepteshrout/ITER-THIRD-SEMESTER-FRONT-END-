/*import java.util.Scanner;
public class question12 {
    public static int createNumber(int num1, int num2) {
        int firstTwoDigits = num1 / (int)Math.pow(10, (int)Math.log10(num1) - 1); // Divide num1 by 10^(number of digits - 2)
        int lastTwoDigits = num2 % 100;
        return firstTwoDigits * 100 + lastTwoDigits;
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read two integer numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the method to create the new number
        int result = createNumber(num1, num2);

        // Output the result
        System.out.println("The new number is: " + result);

        // Close the scanner
        scanner.close();
    }
}
/*import java.util.Scanner;

public class Question12 {

    public static int createNumber(int num1, int num2) {
        int firstTwoDigits = num1 / (int) Math.pow(10, (int) Math.log10(num1) - 1); // First two digits
        return firstTwoDigits * 100 + num2 % 100; // Combine with last two digits of num2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        System.out.println("The new number is: " + createNumber(num1, num2));
        scanner.close();
    }
}
 */




 import java.util.*;

public class question12 {
    public static int removeFirstTwoDigits(int number){
        String numberStr = String.valueOf(number);
        if (numberStr.length()>2) {
            String newNumberStr = numberStr.substring(0,2);
            return Integer.parseInt(newNumberStr);
        }
        else{
            return 0;
        }
    }

    public static int removeLastTwoDigits(int number1){
        return number1 % 100;
    }

    public static int createNumber(int number,int number1){
        return removeFirstTwoDigits(number)*100+removeLastTwoDigits(number1);
    }

    public static void main(String[] args) {
        System.out.println(createNumber(45678,312));
    }
}