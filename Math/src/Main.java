public class Main {
    public static void main(String[] args) {
        int result = (int)Math.round(1.1F);
        System.out.println(result);
        result = (int)Math.ceil(1.1F);
        System.out.println(result);
        result = (int)Math.floor(1.1F);
        System.out.println(result);
        result = (int)Math.max(1,2);
        System.out.println(result);
        result = (int)Math.min(1,4);
        System.out.println(result);
        double result1 = Math.random() * 100;
        System.out.println(result1);
        int result2 = (int)Math.round(Math.random() * 100);
        System.out.println(result2);

    }
}