import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String result = money.format(253786.863);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        result = percent.format(0.1);
        System.out.println(result);

        result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}