import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private String statusOrder;
    private Customer customer;
    private LocalDateTime orderDateTime;
    private int cartID;
    private float totalPrice;
    private float drinkPrice;
    private float tablePrice;
    private List<Drink> drinks;
    private List<Topping> toppings;

    // Constructor
    public Order(Customer customer) {
        this.orderID = generateOrderID();
        this.customer = customer;
        this.orderDateTime = LocalDateTime.now();
        this.drinks = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.totalPrice = calculateTotalPrice();
    }

    // Method to generate order ID (example implementation)
    private int generateOrderID() {
        return (int) (Math.random() * 100000); // Random ID generation for simplicity
    }

    // Method to calculate the total price
    float calculateTotalPrice() {
        float drinksTotal = 0;
        for (Drink drink : drinks) {
            drinksTotal += drink.getPrice();
        }

        float toppingsTotal = 0;
        for (Topping topping : toppings) {
            toppingsTotal += topping.getPrice();
        }

        return drinksTotal + toppingsTotal + tablePrice;
    }

    // Method to get customer information
    public Customer getCustomer() {
        return customer;
    }

    // Method to set the order time
    public void setOrderTime(LocalDateTime time) {
        this.orderDateTime = time;
    }

    // Method to check order status
    public boolean setCheckOrder() {
        return statusOrder != null && !statusOrder.isEmpty();
    }

    // Method to get order details
    public String getOrderDetails() {
        return "Order ID: " + orderID + ", ชื่อลูกค้า: " + customer.getName();
    }

    // Method to get order status
    public String getOrderStatus() {
        return statusOrder;
    }

    // Method to get order date and time
    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    // Method to get the total price of the order
    public float getTotalPrice() {
        return calculateTotalPrice(); // Always recalculate in case prices change
    }

    // Method to get order ID
    public int getOrderID() {
        return orderID;
    }

    // Method to set the drink price and recalculate total
    public void setDrinkPrice(float drinkPrice) {
        this.drinkPrice = drinkPrice;
        this.totalPrice = calculateTotalPrice();
    }

    // Method to set the table price and recalculate total
    public void setTablePrice(float tablePrice) {
        this.tablePrice = tablePrice;
        this.totalPrice = calculateTotalPrice();
    }

    // Method to add a drink to the order
    public void addDrink(Drink drink) {
        if (drink != null) {
            drinks.add(drink);
            this.totalPrice = calculateTotalPrice();
        }
    }

    // Method to add a topping to the order
    public void addTopping(Topping topping) {
        if (topping != null) {
            toppings.add(topping);
            this.totalPrice = calculateTotalPrice();
        }
    }
}
