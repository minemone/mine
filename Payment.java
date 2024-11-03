public class Payment {
    private int paymentID;
    private String paymentMethod;
    private int orderID;
    private String customerID; // เพิ่ม customerID
    private float pointCustomer;
    private float totalPrice;

    // Constructor ที่ปรับปรุง
    public Payment(int paymentID, String paymentMethod, int orderID, String string, float totalPrice) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.orderID = orderID;
        this.customerID = string; // ตั้งค่าลงใน customerID
        this.totalPrice = totalPrice;
        this.pointCustomer = 0; // ตั้งค่าเริ่มต้นสำหรับคะแนน
    }

    // Getter methods
    public int getPaymentID() {
        return paymentID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCustomerID() { // เพิ่ม getter สำหรับ customerID
        return customerID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setPaymentMethod(String method) {
        this.paymentMethod = method;
    }

    public void setPointsRefunded(int points) {
        // Set points refunded logic here
        this.pointCustomer += points; // ตัวอย่างการเพิ่มคะแนนที่คืน
    }

    public float getPointCustomer() {
        return pointCustomer; // Getter สำหรับคะแนน
    }
}
