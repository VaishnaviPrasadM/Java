import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the from currency (USD, EUR, JPY, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the to currency (USD, EUR, JPY, INR): ");
        String toCurrency = scanner.next().toUpperCase();

       
        double conversionRate = 0.0;

        switch (fromCurrency) {
            case "USD":
                if (toCurrency.equals("INR")) conversionRate = 85.0;
                else if (toCurrency.equals("EUR")) conversionRate = 0.90;
                else if (toCurrency.equals("JPY")) conversionRate = 135.0;
                break;
            case "EUR":
                if (toCurrency.equals("USD")) conversionRate = 1.11;
                else if (toCurrency.equals("INR")) conversionRate = 94.0;
                else if (toCurrency.equals("JPY")) conversionRate = 149.0;
                break;
            case "JPY":
                if (toCurrency.equals("USD")) conversionRate = 0.0074;
                else if (toCurrency.equals("EUR")) conversionRate = 0.0067;
                else if (toCurrency.equals("INR")) conversionRate = 6.30;
                break;
            case "INR":
                if (toCurrency.equals("USD")) conversionRate = 0.0118;
                else if (toCurrency.equals("EUR")) conversionRate = 0.0106;
                else if (toCurrency.equals("JPY")) conversionRate = 16.13;
                break;
            default:
                System.out.println("Invalid currency.");
                return;
        }

        if (conversionRate != 0.0) {
            System.out.println(amount + " " + fromCurrency + " = " + (amount * conversionRate) + " " + toCurrency);
        }
    }
}
10.