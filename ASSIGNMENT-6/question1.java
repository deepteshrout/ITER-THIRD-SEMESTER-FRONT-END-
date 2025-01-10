public class question1 {
    public static void main(String[] args) {
        int num = 42;
        Integer integerAutoInteger = num;
        System.out.println(integerAutoInteger+" ");//Autoboxing Using Constructor

        @SuppressWarnings("removal")
        Integer integerConstructoInteger = new Integer(42);
        System.out.println(integerConstructoInteger+ " "); // Using Constructor
    }
}
