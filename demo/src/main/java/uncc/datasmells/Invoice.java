package uncc.datasmells;

public class Invoice {

    private String invoiceId;
    private Order order;
    private double taxRate;
    private double discount;

    public Invoice(String invoiceId, Order order, double taxRate, double discount) {
        this.invoiceId = invoiceId;
        this.order = order;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public Order getOrder() {
        return order;
    }

    public double calculateFinalAmount() {
        double base = order.calculateTotal();
        double tax = base * taxRate; 
        return base + tax - discount;
    }

    public void printInvoiceSummary() {
        System.out.println("\nInvoice ID: " + this.getInvoiceId());
        double finalAmount = this.calculateFinalAmount();
        System.out.println("Final Amount (with tax & discount): $" + finalAmount);
    }
}