import java.util.Date;
import java.util.List;

public class Promotion {
    private String name;
    private String drinkType;
    private String selectPromotion;
    private Date promotionPeriod;
    private int sales;

    // Constructor
    public Promotion(String name, String drinkType, Date promotionPeriod) {
        this.name = name;
        this.drinkType = drinkType;
        this.promotionPeriod = promotionPeriod;
        this.sales = 0; // เริ่มต้นยอดขายที่ 0
    }

    // Method แสดงชื่อเครื่องดื่ม
    public String getName() {
        return name;
    }

    // Method กำหนดประเภทเครื่องดื่ม
    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    // Method ดึงโปรโมชั่นที่เลือก
    public String getSelectPromotion() {
        return selectPromotion;
    }

    // Method กำหนดระยะเวลาโปรโมชั่น
    public void setPromotionPeriod(int days) {
        // สมมติให้เพิ่มจำนวนวันเข้าไปในระยะเวลาปัจจุบัน
        this.promotionPeriod = new Date(promotionPeriod.getTime() + (long)days * 24 * 60 * 60 * 1000);
    }

    // Method ดึงยอดขาย
    public int getSales() {
        return sales;
    }

    // Method กำหนดยอดขาย
    public void setSales(int sales) {
        this.sales = sales;
    }

    // Method แสดง 3 รายการที่ขายดีที่สุด
    public List<Drink> viewTop3BestSellingItems() {
        // ลอจิกการคำนวณสินค้าที่ขายดีที่สุด
        return null; // ตัวอย่าง, ในความเป็นจริงจะต้องมีการคำนวณและคืนรายการ
    }

    // Method แสดง 3 รายการที่ขายน้อยที่สุด
    public List<Drink> viewTop3LeastSellingItems() {
        // ลอจิกการคำนวณสินค้าที่ขายน้อยที่สุด
        return null; // ตัวอย่าง, ในความเป็นจริงจะต้องมีการคำนวณและคืนรายการ
    }
}
