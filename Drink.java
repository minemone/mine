public class Drink {
    private int drinkID;
    private String name;
    private float drinkprice;
    private String sweetnessLevel;
    private String toppingName;
    private DrinkType drinkType;
    private int sales;

    // Constructor
    public Drink(int drinkID, String name ,float drinkprice) {
        this.drinkID = drinkID;
        this.name = name;
        this.drinkprice = drinkprice;  
        this.sweetnessLevel = "ปกติ"; // ระดับความหวานเริ่มต้นเป็น Medium
        this.toppingName = "ไม่ใส่"; // ไม่มีท็อปปิ้งเริ่มต้น
        this.sales = 0; // ยอดขายเริ่มต้นเป็น 0
    }

    // Method แสดงชื่อเครื่องดื่ม
    public String getName() {
        return name;
    }

    // Method ดึงราคาเครื่องดื่ม
    public float getPrice() {
        return drinkprice;
    }

    // Method กำหนดระดับความหวาน
    public void setSweetnessLevel(String sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    // Method ดึงความหวาน
    public Sweetness getSweetness() {
        return new Sweetness(sweetnessLevel); // Return object ของ Sweetness
    }

    // Method กำหนดท็อปปิ้ง
    public void setTopping(Topping topping) {
        this.toppingName = topping.getToppingName();
    }

    // Method ดึงท็อปปิ้ง
    public Topping getTopping() {
        return new Topping(toppingName); // Return object ของ Topping
    }

    // Method กำหนดประเภทเครื่องดื่ม
    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    // Method ดึงประเภทเครื่องดื่ม
    public DrinkType getDrinkType() {
        return drinkType;
    }

    // Method ดึงยอดขายเครื่องดื่ม
    public int getSales() {
        return sales;
    }

    // Method กำหนดยอดขายเครื่องดื่ม
    public void setSales(int sales) {
        this.sales = sales;
    }    
}
