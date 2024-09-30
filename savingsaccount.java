public class SavingsAccount {
    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        System.out.println("Monthly interest added: " + monthlyInterest);
    }

    public static void modifyInterestRate(double newRate) {
        if (newRate >= 0) {
            annualInterestRate = newRate;
            System.out.println("Annual interest rate modified to: " + (newRate * 100) + "%");
        } else {
            System.out.println("Invalid interest rate. It cannot be negative.");
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.03);

        SavingsAccount saver1 = new SavingsAccount(5000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after rate change: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance after rate change: $" + saver2.getSavingsBalance());
    }
}
