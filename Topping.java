public class Topping {
    private String toppingID;
    private String toppingName;

    // Constructor
    public Topping(String toppingName) {
        this.toppingName = toppingName;
    }

    // Method ดึงชื่อท็อปปิ้ง
    public String getToppingName() {
        return toppingName;
    }

    // Method ตั้งค่าท็อปปิ้ง
    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }
}
