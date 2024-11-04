import java.util.List;

public class Topping {
    private String toppingID;
    private String toppingName;
    private double price;

    // Constructor
    public Topping(String toppingName, double price) {
        this.toppingName = toppingName;
        this.price = price;
    }

    // Method ดึงชื่อท็อปปิ้ง
    public String getToppingName() {
        return toppingName;
    }

    // Method ตั้งค่าท็อปปิ้ง
    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    // Method ดึงราคา
    public double getPrice() {
        return price;
    }

    // Method ตั้งค่าราคา
    public void setPrice(double price) {
        this.price = price;
    }

    // Method สำหรับการเพิ่ม Topping ในที่ที่เกี่ยวข้อง
    public static void add(Topping topping, List<Topping> toppingList) {
        if (topping != null && toppingList != null) {
            toppingList.add(topping);
        }
    }
}
