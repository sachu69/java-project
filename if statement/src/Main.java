public class Main {
    public static void main(String[] args) {
        int temp = 25;
        if (temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        // turnury operator
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

    }
}