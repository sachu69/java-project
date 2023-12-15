public class Main {
    public static void main(String[] args) {
        // Implicit casting
        double a =  1.1;
        double b = a + 3;
        System.out.println(b);
        // Explicit casting
        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);

        String s = "1";
        y = Integer.parseInt(s) + 2;
        System.out.println(y);


    }
}