import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte months = 12;
        final byte percent = 100;
        int principal = 0;
        float interest = 0;
        int years = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal (₹1K - ₹1M): ");
            principal = scanner.nextInt();

            if ((principal > 1_000) && (principal <= 1_000_000))
                break;
            else
                System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if ((interest > 0) && (interest <= 30))
                break;
            else
                System.out.println("Enter a value greaterthan 0 and less than or equal to 30.");
        }
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if ((years > 0) && (years <= 30))
                break;
            else
                System.out.println("Enter a value between 1 and 30.");
        }
        interest = ((interest / percent) / months);
        interest = 1 + interest;
        int numberOfPayments = (years * months);
        double dummy = Math.pow(interest, (double) numberOfPayments);
        interest = interest - 1;
        double mortgage = (principal * ((interest * dummy) / (dummy - 1)));
        mortgage = Math.round(mortgage);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + currency.format(mortgage));

        }
    }