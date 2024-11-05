import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Drink> items = new ArrayList<>();
    private List<Drink> drinks;
    private List<Topping> toppings;
    private List<Sweetness> sweetnesses;
    private List<PreparationType> PreparationTypes;
    private float totalPrice;

    // Constructor
    public Cart() {
        this.drinks = new ArrayList<>();
        this.PreparationTypes = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sweetnesses = new ArrayList<>();
        this.totalPrice = 0.0f;
    }

    
    public List<Drink> getItems() {
        return items;
    }

    public void addItem(Drink selectedDrink) {
        // เพิ่มเครื่องดื่มลงในรายการ
        drinks.add(selectedDrink);
        // เพิ่มราคาเครื่องดื่มไปยังราคาทั้งหมด
        totalPrice += selectedDrink.getPrice();
    }

    public void addItem(Topping selectedTopping) {
        // เพิ่ม Topping ลงในรายการ
        toppings.add(selectedTopping);
    }
    public void addItem(Sweetness selectedSweetness) {
        // เพิ่ม Topping ลงในรายการ
        sweetnesses.add(selectedSweetness);
        // เพิ่มราคา Topping ไปยังราคาทั้งหมด
    }

    public void addItem(PreparationType selectedPreparationType) {
        // เพิ่ม Topping ลงในรายการ
        PreparationTypes.add(selectedPreparationType);
        // เพิ่มราคา Topping ไปยังราคาทั้งหมด
    }

    public boolean isEmpty() {
        // ตรวจสอบว่ารายการเครื่องดื่มและท็อปปิ้งว่างหรือไม่
        return drinks.isEmpty() && toppings.isEmpty();
    }

    public float getTotalPrice() {
        // คืนค่าราคารวมของรายการทั้งหมด
        return totalPrice;
    }

    public void displayCart() {
        StringBuilder cartSummary = new StringBuilder();
    
        // แสดงรายการเครื่องดื่มในตะกร้า
        cartSummary.append("รายการเครื่องดื่มในตะกร้า: ");
        for (Drink drink : drinks) {
            cartSummary.append(drink.getName()).append(" (ราคา: ").append(drink.getPrice()).append("), ");
        }
    
        // แสดงรายการท็อปปิ้งในตะกร้า
        cartSummary.append("\nรายการท็อปปิ้งในตะกร้า: ");
        if (toppings.isEmpty()) {
            cartSummary.append("ไม่มีท็อปปิ้ง, ");
        } else {
            for (Topping topping : toppings) {
                cartSummary.append(topping.getToppingName()).append(", ");
            }
        }
    
        // แสดงระดับความหวาน
        cartSummary.append("\nระดับความหวาน: ");
        if (sweetnesses.isEmpty()) {
            cartSummary.append("ไม่มีระดับความหวาน, ");
        } else {
            for (Sweetness sweetness : sweetnesses) {
                cartSummary.append(sweetness.getSweetnessName()).append(", ");
            }
        }
    
        // แสดงประเภทเครื่องดื่ม
        cartSummary.append("\nประเภทเครื่องดื่ม: ");
        if (PreparationTypes.isEmpty()) {
            cartSummary.append("ไม่มีประเภทเครื่องดื่ม, ");
        } else {
            for (PreparationType preparationType : PreparationTypes) {
                cartSummary.append(preparationType.getPrepName()).append(", ");
            }
        }
    
        // แสดงราคารวม
        cartSummary.append("\nราคารวม: ").append(totalPrice);
    
        // พิมพ์ผลลัพธ์ออกมา
        System.out.println(cartSummary.toString());
    }
    

    public void clearCart() {
        // ล้างรายการในตะกร้า
        drinks.clear();
        toppings.clear();
        totalPrice = 0.0f;
        System.out.println("ตะกร้าถูกล้างเรียบร้อยแล้ว.");
    }

}
