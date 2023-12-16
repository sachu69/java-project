import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World");

        int i = 5;
        while (i > 0){
            System.out.println("Hello World");
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}