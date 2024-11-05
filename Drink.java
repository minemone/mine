public class Drink {
    private int drinkID;
    private String name;
    private float drinkprice;
    private SweetnessLevel sweetnessLevel;
    private Topping topping;
    private PreparationType preparationType;
    private DrinkCategory category;
    private int sales;

    // คอนสตรัคเตอร์ที่รวมทุกพารามิเตอร์
    public Drink(int drinkID, String name, float drinkprice, SweetnessLevel sweetnessLevel, Topping topping, PreparationType preparationType, DrinkCategory category, int sales) {
        this.drinkID = drinkID;
        this.name = name;
        this.drinkprice = drinkprice;
        this.sweetnessLevel = sweetnessLevel;
        this.topping = topping;
        this.preparationType = preparationType;
        this.category = category;
        this.sales = sales;
    }

    public int getSales() {
        return sales;
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
    public void setSweetnessLevel(SweetnessLevel sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    // Method ดึงความหวาน
    public SweetnessLevel getSweetness() {
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

    // Method กำหนด PreparationType
    public void setPreparationType(PreparationType preparationType) {
        this.preparationType = preparationType;
    }

    // Method ดึง PreparationType
    public PreparationType getPreparationType() {
        return preparationType;
    }

    public DrinkCategory getCategory() {
        return category;
    }
}
