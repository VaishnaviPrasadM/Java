import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType;

    public ElectricityBill(String consumerNo, String consumerName, double previousReading,
                           double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public double computeBill() {
        double unitsConsumed = currentReading - previousReading;
        double billAmount = 0;

        double domesticRate = 5.0;     // Rate per unit for domestic
        double commercialRate = 8.0;   // Rate per unit for commercial

        if (connectionType.equalsIgnoreCase("domestic")) {
            billAmount = unitsConsumed * domesticRate;
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            billAmount = unitsConsumed * commercialRate;
        } else {
            System.out.println("Invalid connection type.");
        }

        return billAmount;
    }

    public void displayBill() {
        System.out.println("Electricity Bill");
        System.out.println("-----------------");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousReading);
        System.out.println("Current Month Reading: " + currentReading);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill Amount: " + computeBill());
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();

        System.out.print("Enter Type of EB Connection (domestic/commercial): ");
        String connectionType = scanner.next();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);

        bill.displayBill();

        scanner.close();
    }
}