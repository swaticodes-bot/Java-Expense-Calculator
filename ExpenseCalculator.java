import java.util.LinkedHashMap;
import java.util.Map;

public class ExpenseCalculator {
    public static void main(String[] args) {
        Map<String, Double> expenses = new LinkedHashMap<>();
        expenses.put("Food", 1800.0);
        expenses.put("Transport", 650.0);
        expenses.put("Books", 1200.0);

        double total = expenses.values().stream().mapToDouble(Double::doubleValue).sum();
        double budget = 5000.0;

        expenses.forEach((category, amount) ->
                System.out.printf("%-12s %.2f%n", category, amount));
        System.out.printf("Total: %.2f%nRemaining budget: %.2f%n", total, budget - total);
    }
}
