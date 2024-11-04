public class Payment {
    private float paymentID;
    private String paymentMethod;
    private int orderID;
    private String customerID; // เพิ่ม customerID
    private float pointCustomer;
    private float totalPrice;

    // Constructor ที่ปรับปรุง
    public Payment(float paymentID, String paymentMethod) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.orderID = orderID;
        this.customerID = customerID; // รับ customerID ที่ถูกต้องจากการเรียกใช้
        this.totalPrice = totalPrice;
        this.pointCustomer = 0; // ตั้งค่าเริ่มต้นสำหรับคะแนน
    }

    // Getter methods
    public float getPaymentID() {
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
        // Logic สำหรับการคืนคะแนน
        this.pointCustomer += points; // ตัวอย่างการเพิ่มคะแนนที่คืน
    }

    public float getPointCustomer() {
        return pointCustomer; // Getter สำหรับคะแนน
    }

    // Method สำหรับประมวลผลการชำระเงิน
    public void processPayment() {
        // ตัวอย่างการทำงานพื้นฐานของการประมวลผลการชำระเงิน
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Total amount: " + totalPrice + " THB");
        System.out.println("Payment successful!");
    }
}
