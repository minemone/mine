public class Status {
    private int statusID;
    private int cafetableID;
    private int orderID;
    private String statusDesc;

    // Constructor
    public Status(int statusID, int cafetableID, int orderID, String statusDesc) {
        this.statusID = statusID;
        this.cafetableID = cafetableID;
        this.orderID = orderID;
        this.statusDesc = statusDesc;
    }

    // Method ดึงคำอธิบายสถานะปัจจุบัน
    public String getStatusDescription() {
        return statusDesc;
    }

    // Method ดึงหมายเลขคำสั่งซื้อจาก orderID
    public int getOrderID() {
        return orderID;
    }

    // Method ดึงหมายเลขโต๊ะจาก cafeTableID
    public int getCafeTableID() {
        return cafetableID;
    }

    // Method ตรวจสอบสถานะคำสั่งซื้อว่าเสร็จสิ้นหรือยัง
    public boolean isOrderCompleted() {
        return statusDesc.equals("Completed");
    }

    // Method แสดงสถานะคำสั่งซื้อ
    public void displayOrderStatus() {
        System.out.println("Order Status for order ID " + orderID + ": " + statusDesc);
    }

    // Method เลือกเปลี่ยนสถานะคำสั่งซื้อ
    public void selectChangeOrderStatus(String newStatus) {
        this.statusDesc = newStatus;
        System.out.println("Order status changed to: " + newStatus);
    }

    // Method แสดงสถานะโต๊ะ
    public void displayTableStatus() {
        System.out.println("Table ID " + cafetableID + " status: " + statusDesc);
    }

    // Method จองโต๊ะ
    public void reserveTable() {
        System.out.println("Table ID " + cafetableID + " has been reserved.");
    }

    // Method ติดตามสถานะคำสั่งซื้อ
    public void trackOrderStatus() {
        System.out.println("Tracking order ID " + orderID + ". Current status: " + statusDesc);
    }
}
