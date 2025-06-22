public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValue(double pv, double r, int n) {
        // Base case: If no years have passed, return the present value
        if (n == 0) {
            return pv;
        }
        // Recursive case: Calculate future value using the previous year's value
        else {
            return futureValue(pv, r, n - 1) * (1 + r);
        }
    }

    public static void main(String[] args) {
        double pv = 1000; // Present Value
        double r = 0.05;  // Growth Rate (5%)
        int n = 10;       // Number of years

        double futureVal = futureValue(pv, r, n);
        System.out.println("The future value after " + n + " years is: $" + String.format("%.2f", futureVal));
    }
}
