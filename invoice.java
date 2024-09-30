public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
        if (pricePerItem < 0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("12345", "Brake Pads", 4, 20.50);
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Total Invoice Amount: $" + invoice1.getInvoiceAmount());

        Invoice invoice2 = new Invoice("54321", "Oil Filter", -5, -15.75);
        System.out.println("\nPart Number: " + invoice2.getPartNumber());
        System.out.println("Part Description: " + invoice2.getPartDescription());
        System.out.println("Total Invoice Amount: $" + invoice2.getInvoiceAmount());
    }
}
