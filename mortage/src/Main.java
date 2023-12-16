import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        long principal = scanner.nextLong();
        System.out.print("Annual Interest Rate: ");
        float intersest = scanner.nextFloat();
        System.out.print("Period (Years): ");
        long years = scanner.nextInt();

        intersest = ((intersest/100)/12);
        intersest = 1 + intersest;
        years = years*12;
        double dummy = Math.pow(intersest,(double) years);
        intersest = intersest - 1;
        double mortgage = (principal*((intersest*dummy)/(dummy-1)));
        mortgage = Math.round(mortgage);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: "+currency.format(mortgage));

    }
}