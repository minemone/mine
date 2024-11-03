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
    public Receipt(int receiptID, int paymentID, String customerID, float totalPrice, float pointsEarned) {
        this.receiptID = receiptID;
        this.orderDateTime = LocalDateTime.now(); // กำหนดเวลาปัจจุบัน
        this.totalPrice = totalPrice;
        this.pointsEarned = totalPrice/10;
        this.paymentID = paymentID;
        this.customerID = customerID;
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
}