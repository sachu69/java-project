import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}