public class DrinkType {
    private int drinkTypeID;
    private String nameOfDrinkType;

    // Constructor
    public DrinkType(int drinkTypeID, String nameOfDrinkType) {
        this.drinkTypeID = drinkTypeID;
        this.nameOfDrinkType = nameOfDrinkType;
    }

    // Method กำหนดอุณหภูมิ
    public void setTemperature(String temperature) {
        System.out.println("The drink temperature is set to: " + temperature);
    }

    // Method กำหนดประเภทเครื่องดื่ม (ชา นม หรือกาแฟ)
    public void setTeaMilkCoffee(String type) {
        System.out.println("The drink is set to: " + type);
    }

    // Method ดึงประเภทเครื่องดื่ม
    public String getDrinkType() {
        return nameOfDrinkType;
    }
}
