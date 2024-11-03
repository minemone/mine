import java.util.List;

public class Rider extends Person {
    private String riderID;
    private List<Order> orders; // รายการคำสั่งซื้อ
    private String status; // สถานะปัจจุบันของไรเดอร์ เช่น พร้อมทำงาน กำลังจัดส่ง

    // Constructor สำหรับสร้าง Rider
    public Rider(String name, String phoneNumber, String email, String riderID) {
        super(name, phoneNumber, email);
        this.riderID = riderID;
        this.status = "Available"; // ตั้งสถานะเริ่มต้น
    }

    // Method แสดงสถานะการจัดส่งแบบเรียลไทม์
    public String showRealTimeDeliveryStatus(Order order) {
        // ตัวอย่างการ return สถานะการจัดส่ง
        String deliveryStatus = "กำลังจัดส่ง";
        System.out.println("Rider " + getName() + " is delivering order ID " + order.getOrderID() + ": " + deliveryStatus);
        return deliveryStatus;
    }

    // Method ติดตามสถานะการจัดส่งคำสั่งซื้อ
    public void trackDeliveryStatus(Order order) {
        System.out.println("Tracking delivery status for order ID: " + order.getOrderID() + " by Rider " + getName());
    }

    // Method แสดงรายการคำสั่งซื้อของไรเดอร์
    public List<Order> showCustomerOrders() {
        System.out.println("Showing orders for Rider: " + getName());
        return orders;
    }

    // Method ให้ไรเดอร์เลือกจัดส่งคำสั่งซื้อ
    public void selectDeliveryOrder(Order order) {
        System.out.println("Rider " + getName() + " selected order ID: " + order.getOrderID() + " for delivery.");
    }

    // Method ให้ไรเดอร์ยอมรับหรือปฏิเสธคำสั่งซื้อ
    public void acceptOrIgnoreOrder(Order order, boolean accept) {
        if (accept) {
            System.out.println("Rider " + getName() + " accepted order ID: " + order.getOrderID());
        } else {
            System.out.println("Rider " + getName() + " ignored order ID: " + order.getOrderID());
        }
    }

    // Method แสดงสถานะการจัดส่งและข้อมูลการติดต่อกับลูกค้า
    public void showRiderDeliveryStatusAndContact(Order order) {
        System.out.println("Rider " + getName() + " is delivering order ID " + order.getOrderID());
        System.out.println("Contact Customer: " + order.getCustomer().getName());
    }

    // Getters and Setters สำหรับข้อมูลที่จำเป็น
    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
