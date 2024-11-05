import java.time.LocalDateTime;
public class Order {
    private int orderId;
    private LocalDateTime orderDateTime;
    private double totalAmount;
    private Customer customer;
    private String status; // เพิ่มตัวแปร status

    // Constructor
    public Order(int orderId, Customer customer, double totalAmount) {
        this.orderId = orderId;
        this.orderDateTime = LocalDateTime.now();
        this.customer = customer;
        this.totalAmount = totalAmount;
        this.status = "กำลังดำเนินการ"; // กำหนดสถานะเริ่มต้น
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }
}
