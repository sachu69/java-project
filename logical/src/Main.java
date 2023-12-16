public class Main {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
        boolean hasHighincome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighincome || hasGoodCredit) && !hasCriminalRecord ;
        System.out.println(isEligible);
    }
}