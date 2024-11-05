import java.time.LocalDateTime;

public class Receipt {
    private int receiptID;
    private LocalDateTime orderDateTime;
    private double totalPrice;
    private double pointsEarned;
    private int paymentID;
    private String customerName;

    // Constructor
    public Receipt(Order order) {
        this.receiptID = (int) (Math.random() * 100000);
        this.orderDateTime = order.getOrderDateTime();
        this.totalPrice = order.getTotalAmount();
        this.pointsEarned = totalPrice / 10;
        this.paymentID = order.getOrderId();
        this.customerName = order.getCustomer().getName();
    }

    public void printReceipt() {
        System.out.println("===== Receipt =====");
        System.out.println("Receipt ID: " + receiptID);
        System.out.println("Date/Time: " + orderDateTime);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Customer Name: " + customerName);
        System.out.println("===================");
    }
}
