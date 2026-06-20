public class Main {

    public static double calculateFutureValue(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return calculateFutureValue(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double amount = 100000.0;
        double rate = 0.08; // 8% growth rate
        int years = 5;

        double futureValue = calculateFutureValue(amount, rate, years);

        System.out.printf("Current Value: ₹%.2f%n", amount);
        System.out.printf("Future Value after %d years: ₹%.2f%n", years, futureValue);
    }
}