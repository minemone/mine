
public class DrinkType {
    private int drinkTypeID;
    private String nameOfDrinkType;
    private float priceOfDrinkType;

    // Constructor
    public DrinkType(int drinkTypeID, String nameOfDrinkType,float priceOfDrinkType) {
        this.drinkTypeID = drinkTypeID;
        this.nameOfDrinkType = nameOfDrinkType;
        this.priceOfDrinkType = priceOfDrinkType;
    }

    
    public int getdrinkTypeID() {
        return drinkTypeID;
    }

    // Method แสดงชื่อเครื่องดื่ม
    public String getnameOfDrinkType() {
        return nameOfDrinkType;
    }

    // Method ดึงราคาเครื่องดื่ม
    public float getpriceOfDrinkType() {
        return priceOfDrinkType;
    }

    public void setdrinkTypeID(int drinkTypeID) {
        this.drinkTypeID= drinkTypeID;
    }

    public void setnameOfDrinkType(String nameOfDrinkType) {
        this.nameOfDrinkType= nameOfDrinkType;
    }

    public void setpriceOfDrinkType(float priceOfDrinkType) {
        this.priceOfDrinkType= priceOfDrinkType;
    }
   


}
