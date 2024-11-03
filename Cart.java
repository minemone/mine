public class Cart {
    private int cartID;
    private int drinkID;
    private String name;
    private float price;
    private String sweetnessLevel;
    private String toppingName;
    private String drinkType;
    private float totalPrice;

    // Constructor
    public Cart(int cartID, String name, float price, String sweetnessLevel, String toppingName, String drinkType) {
        this.cartID = cartID;
        this.name = name;
        this.price = price;
        this.sweetnessLevel = sweetnessLevel;
        this.toppingName = toppingName;
        this.drinkType = drinkType;
        this.totalPrice = price; // เริ่มต้นด้วยราคาของเครื่องดื่ม
    }

    // Method ดึงชื่อเครื่องดื่ม
    public String getName() {
        return name;
    }

    // Method ดึงราคาของเครื่องดื่ม
    public float getPrice() {
        return price;
    }

    // Method เพิ่มรายการเครื่องดื่มในตะกร้า
    public void addBeverageItemsToCart(Drink drink) {
        this.totalPrice += drink.getPrice();
        System.out.println(drink.getName() + " has been added to the cart.");
    }

    // Method คำนวณราคาทั้งหมดของตะกร้า
    public float calculateTotalPrice() {
        return totalPrice;
    }

    // Method แสดงราคาทั้งหมด
    public float getTotalPrice() {
        return totalPrice;
    }
}
