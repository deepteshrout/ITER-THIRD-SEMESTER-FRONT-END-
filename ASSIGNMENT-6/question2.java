public class question2 {
    public static void main(String[] args) {
        
        float f = (float)45.02;
        Float floatAutoFloat = f;
        System.out.println(floatAutoFloat+" ");

        @SuppressWarnings("removal")
        Float floatConstrucFloat = new Float("45.02");
        System.out.println(floatConstrucFloat);
    }
}
