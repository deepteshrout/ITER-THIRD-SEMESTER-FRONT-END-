public class question7 {
    public static long power(int x, int y) {
        if (y < 0) {
            throw new IllegalArgumentException("Negative powers are not supported.");
        }
        if (y == 0) {
            return 1; 
        }
        return x*power(x, y-1);
    }

    public static void main(String[] args) {
        int x = 3; // Base
        int y = 4; // Exponent

        System.out.println(x + " raised to the power " + y + " is: " + power(x, y));
    }
}
