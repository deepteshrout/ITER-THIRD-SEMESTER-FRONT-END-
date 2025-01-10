/*Write a java program to calculate HCF and LCM of Two given number.  */

import java.util.Scanner;

public class question14 {
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int calculateLCM(int a, int b, int hcf) {
        return (a * b) / hcf; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2, hcf);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
