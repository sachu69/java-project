import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months = 12;
        final byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float intersest = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        intersest = ((intersest/percent)/months);
        intersest = 1 + intersest;
        int numberOfPayments = (years*months);
        double dummy = Math.pow(intersest,(double) numberOfPayments);
        intersest = intersest - 1;
        double mortgage = (principal*((intersest*dummy)/(dummy-1)));
        mortgage = Math.round(mortgage);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: "+currency.format(mortgage));

    }
}