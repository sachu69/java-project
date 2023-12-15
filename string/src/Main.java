import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World" + " Hello Sushil   ";
        System.out.println(message);
        System.out.println(message.endsWith("Sushil"));
        System.out.println(message.length());
        System.out.println(message.indexOf("S"));
        System.out.println(message.replace("W","w"));
        // strings are immutable so replace will not change the orignal string
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        // escape squence
        String chat = "hi i am \"sushil\"";
        System.out.println(chat);
        // c:\Windows\...
        String path = "c:\\Windows\\...";
        System.out.println(path);


    }
}