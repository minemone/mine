public class Customer extends Person {
    private String customerId;
    private float points;

    
    public Customer(String customerId, String name) {
        super(name, "", ""); // กำหนดค่า phoneNumber และ email เป็นค่าเริ่มต้น
        this.customerId = customerId;
    }
    // Constructor
    public Customer(String name, String phoneNumber, String email, String customerId, float points) {
        super(name, phoneNumber, email);
        this.customerId = customerId;
        this.points = points;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Method ดึงคะแนนสะสมของลูกค้า
    public float getPointCustomer() {
        return points;
    }

    // Method แสดงชื่อโต๊ะ
    public String getTableName() {
        // ตัวอย่างการ return ชื่อโต๊ะ
        return "Table 1";
    }

    // Method จองโต๊ะ
    public void setReserve(int tableID) {
        System.out.println("Table ID " + tableID + " has been reserved for customer " + getName());
    }

    // Method เปลี่ยนการจัดวางโต๊ะ
    public void setChangeTableLayout(String layout) {
        System.out.println("Table layout has been changed to " + layout + " for customer " + getName());
    }

    // Method ติดตามสถานะคำสั่งซื้อ
    public void setTrackOrderStatus(String status) {
        System.out.println("Order status for customer " + getName() + " is: " + status);
    }

    // Method ระบุหมายเลขโต๊ะ
    public void setSpecifyTable(int tableID) {
        System.out.println("Customer " + getName() + " has specified table ID: " + tableID);
    }

    // Method ดูใบเสร็จการจองโต๊ะ
    public void showViewTableReservationReceipt() {
        System.out.println("Viewing table reservation receipt for customer " + getName());
    }

    // Method แสดงรายละเอียดของแต่ละโต๊ะ
    public void showDetailsOfEachTable() {
        System.out.println("Showing table details for customer " + getName());
    }

    // Method แสดงสถานะของโต๊ะ
    public String getTableStatus() {
        return "Available"; // ตัวอย่างสถานะโต๊ะ
    }

    // Method ดึงข้อมูลโต๊ะ
    public Cafetable getTable() {
        // Return object ของ Cafetable (ตัวอย่าง)
        return new Cafetable(1, "Table 1", 500.0f);
    }

    // Method ดึงราคาของโต๊ะ
    public float getPrice() {
        // Return ราคาโต๊ะ (ตัวอย่าง)
        return 500.0f;
    }

    // Method เลือกโปรโมชั่น
    public void setSelectPromotion(Promotion promotion) {
        System.out.println("Customer " + getName() + " selected promotion: " + promotion.getSelectPromotion());
    }

    // Method แสดงรายละเอียดโปรโมชั่นที่เลือก
    public String getPromotionDetails() {
        return "Holiday Special Discount"; // ตัวอย่างโปรโมชั่น
    }

    // Method สั่งล่วงหน้าเครื่องดื่ม
    public void setPreorderADrink(String drinkID) {
        System.out.println("Customer " + getName() + " has preordered drink ID: " + drinkID);
    }

    // Method สั่งเครื่องดื่ม
    public void setOrderADrink(String drinkID) {
        System.out.println("Customer " + getName() + " ordered drink ID: " + drinkID);
    }
}
