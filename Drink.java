class Drink {
    private int drinkID;
    private String name;
    private float drinkprice;
    private String sweetnessLevel;
    private Topping topping;
    private DrinkType drinkType;
    private DrinkCategory category;
    private int sales;

    // Constructor
    public Drink(int drinkID, String name, float drinkprice,DrinkCategory category) {
        this.drinkID = drinkID;
        this.name = name;
        this.drinkprice = drinkprice;
        this.sweetnessLevel = "หวานปกติ"; // ระดับความหวานเริ่มต้นเป็น Medium
        this.topping = null; // ไม่มีท็อปปิ้งเริ่มต้น
        this.sales = 0; // ยอดขายเริ่มต้นเป็น 0
        this.category = category;
    }

    public int getDrinkID() {
        return drinkID;
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
    public String getSweetness() {
        return sweetnessLevel;
    }

    // Method กำหนดท็อปปิ้ง
    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    // Method ดึงท็อปปิ้ง
    public Topping getTopping() {
        return topping;
    }

    // Method กำหนดประเภทเครื่องดื่ม
    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    // Method ดึงประเภทเครื่องดื่ม
    public DrinkType getDrinkType() {
        return drinkType;
    }

    public DrinkCategory getCategory() {
        return category;
    }


}
