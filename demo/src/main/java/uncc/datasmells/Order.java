package uncc.datasmells;

import java.util.List;

public class Order {

    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(String orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    public String getOrderId() { return orderId; }

    public Customer getCustomer() { return customer; }

    public List<Product> getProducts() { return products; }

    //Not sure what this method does
     public double calculateTotal(){
       return this.getProducts()
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

public void printOrderSummary() {
        //Uses Order Data 
        System.out.println("Order ID: " + this.getOrderId());
        System.out.println("Customer: " + customer.getName());

        //Put into Product
        this.getProducts().forEach(product ->
            //This can be moved to product public String printSummaryData()
                System.out.println(product.printSummaryData()));
    }
}