import java.time.LocalDateTime;

public class Receipt {
    private int receiptID;
    private LocalDateTime orderDateTime;
    private float totalPrice;
    private float pointsEarned;
    private int paymentID;
    private String customerID;
    private float points;

    // Constructor
    public Receipt(int receiptID, int paymentID, String customerID, float totalPrice) {
        this.receiptID = receiptID;
        this.orderDateTime = LocalDateTime.now(); // กำหนดเวลาปัจจุบัน
        this.totalPrice = totalPrice;
        this.pointsEarned = totalPrice / 10; // คำนวณคะแนนที่ได้รับ (สมมติว่าได้ 1 พอยท์ต่อยอด 10 หน่วย)
        this.paymentID = paymentID;
        this.customerID = customerID;
        this.points = pointsEarned;
    }

    // Constructor ที่รับออบเจกต์ Order
    public Receipt(Order order) {
        this.receiptID = (int) (Math.random() * 100000); // ตัวอย่างการสร้างเลขที่ใบเสร็จแบบสุ่ม
        this.orderDateTime = order.getOrderDateTime();
        this.totalPrice = order.getTotalPrice();
        this.pointsEarned = totalPrice / 10;
        this.paymentID = order.getOrderID(); // ใช้ orderID เป็นการแทน paymentID ชั่วคราว
        this.customerID = order.getCustomer().getName();
        this.points = pointsEarned;
    }

    // Method ดึงข้อมูลการชำระเงิน
    public int getPaymentID() {
        return paymentID;
    }

    // Method ดึงยอดรวมคำสั่งซื้อ
    public float getSummaryOfOrderTotal() {
        return totalPrice;
    }

    // Method แสดงรายละเอียดใบเสร็จ
    public void getReceiptDetails() {
        System.out.println("เลขที่ใบเสร็จ: " + receiptID);
        System.out.println("วัน/เวลา: " + orderDateTime);
        System.out.println("ราคารวม: " + totalPrice);
        System.out.println("พอยท์ที่ได้รับ: " + pointsEarned);
    }

    // Method ดึงข้อมูลลูกค้า
    public String getCustomer() {
        return customerID;
    }

    // Method ดึงเวลาคำสั่งซื้อ
    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    // Method ดึงคะแนนสะสมที่ได้
    public float getPointsEarned() {
        return pointsEarned;
    }

    // Method แสดงใบเสร็จ
    public void printReceipt() {
        System.out.println("===== ใบเสร็จ =====");
        getReceiptDetails();
        System.out.println("===================");
    }
}
