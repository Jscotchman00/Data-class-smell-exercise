package uncc.datasmells;

public class OrderService {

    //Belongs in Get Product
    //Get rid of the function and move all behavior into the object
    //Make the service create the object
    /* 
   Order order = new Order(null, null, null);
   //order.calcuateTotal

    //Does this behavior need to be outside of Invoice Class? Uses all methods No
    //Invoice Param, uses calculate total...
    Invoice invoice = new Invoice(null, order, 0, 0);
    //invoice.CalculateFinalAmount

    //printOrderSummary
    //order.printOrderSummary
    public void printOrderSummary(Order order) {
        //ShouldbeFine
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer().getName());

        //Put into Product
        order.getProducts().forEach(product ->
                System.out.println("- " + product.getName() +
                        " $" + product.getPrice()));
    }
*/

/* 
    public void printInvoiceSummary(Invoice invoice) {
        System.out.println("\nInvoice ID: " + invoice.getInvoiceId());
        double finalAmount = invoice.calculateFinalAmount();
        System.out.println("Final Amount (with tax & discount): $" + finalAmount);
    }
        */

    public void processOrder(Order order, Invoice invoice){

        //service.printOrderSummary(order);
        order.printOrderSummary();

        double total = order.calculateTotal();
        System.out.println("Order Total: $" + total);

        //service.printInvoiceSummary(invoice);
        invoice.printInvoiceSummary();
    }

    }