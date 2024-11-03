public class Cafetable {
    private int cafetableID;
    private String tableName;
    private float tablePrice;

    // Constructor
    public Cafetable(int cafetableID, String tableName, float tablePrice) {
        this.cafetableID = cafetableID;
        this.tableName = tableName;
        this.tablePrice = tablePrice;
    }

    // Method จองโต๊ะ
    public void reserveTable() {
        System.out.println("Table ID " + cafetableID + " has been reserved.");
    }

    // Method เปลี่ยนการจัดวางโต๊ะ
    public void changeTableLayout(String layout) {
        System.out.println("Table layout has been changed to: " + layout);
    }

    // Method ติดตามสถานะคำสั่งซื้อ
    public void trackOrderStatus(Order order) {
        System.out.println("Tracking order status for table: " + tableName);
        // ตัวอย่างการใช้ order
        System.out.println("Order status: " + order.getOrderStatus());
    }

    // Method ระบุหมายเลขโต๊ะ
    public void specifyTable(int tableID) {
        this.cafetableID = tableID;
        System.out.println("Table ID has been set to: " + tableID);
    }

    // Method อัปเดตสถานะโต๊ะ
    public void updateTableStatus(String status) {
        System.out.println("Table status has been updated to: " + status);
    }

    // Method ดูใบเสร็จการจองโต๊ะ
    public void viewTableReservationReceipt() {
        System.out.println("Viewing reservation receipt for table: " + tableName);
    }

    // Method แสดงรายละเอียดของแต่ละโต๊ะ
    public void showDetailsOfTable() {
        System.out.println("รายละเอียดโต๊ะ: ID = " + cafetableID + ", ชื่อโต๊ะ = " + tableName + ", ราคาโต๊ะ = " + tablePrice);
    }

    // Method ล้างโต๊ะ
    public void clearTable() {
        System.out.println("Table ID " + cafetableID + " has been cleared.");
    }

    // Method ดึงสถานะโต๊ะ
    public String getTableStatus() {
        return "Available"; // ตัวอย่างสถานะ
    }

    // Method ดึงข้อมูลโต๊ะ
    public Cafetable getTable() {
        return this; // Return object โต๊ะ
    }

    // Method ดึงราคาของโต๊ะ
    public float getTablePrice() {
        return tablePrice;
    }

    public int getCafetableID() {
        return cafetableID;
    }
}
