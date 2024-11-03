import java.time.LocalDateTime;

public class Delivery {
    private String deliveryID;
    private LocalDateTime deliveryTime;
    private String deliveryAddress;
    private String deliveryStatusDesc;

    // Constructor สำหรับสร้าง Delivery
    public Delivery(String deliveryID, LocalDateTime deliveryTime, String deliveryAddress, String deliveryStatusDesc) {
        this.deliveryID = deliveryID;
        this.deliveryTime = deliveryTime;
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatusDesc = deliveryStatusDesc;
    }

    // Method สำหรับข้อมูลการชำระเงิน
    public void payment(int paymentID) {
        System.out.println("Payment completed with Payment ID: " + paymentID);
    }

    // Method สำหรับดึงหมายเลขการชำระเงิน
    public int getPaymentID() {
        // ตัวอย่าง return หมายเลขการชำระเงิน
        return 12345;
    }

    // Method สำหรับดึงยอดรวมคำสั่งซื้อทั้งหมด
    public float getSummaryOfOrderTotal() {
        // ตัวอย่าง return ยอดรวมคำสั่งซื้อ
        return 250.0f;
    }

    // Method สำหรับแสดงรายละเอียดใบเสร็จ
    public void getReceiptDetails() {
        System.out.println("Displaying receipt details for delivery ID: " + deliveryID);
    }

    // Method สำหรับดึงข้อมูลลูกค้า
    public Customer getCustomer() {
        // ตัวอย่าง return ข้อมูลลูกค้า
        return new Customer("C001", "John Doe");
    }

    // Method สำหรับดึงวันและเวลาที่ทำการสั่งซื้อ
    public LocalDateTime getOrderDateTime() {
        return deliveryTime;
    }

    // Method สำหรับดึงคะแนนที่ได้รับจากการสั่งซื้อ
    public float getPointsEarned() {
        // ตัวอย่าง return คะแนนที่ได้รับ
        return 10.0f;
    }

    // Getter และ Setter สำหรับข้อมูลที่จำเป็น
    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryStatusDesc() {
        return deliveryStatusDesc;
    }

    public void setDeliveryStatusDesc(String deliveryStatusDesc) {
        this.deliveryStatusDesc = deliveryStatusDesc;
    }
}
