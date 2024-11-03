import java.time.LocalDateTime;

public class Order {
    private int orderID;
    private String statusOrder;
    private Customer customer;
    private LocalDateTime orderDateTime;
    private int cartID;
    private float totalPrice;
    private float drinkprice;
    private float tableprice;

    // Constructor
    public Order(int orderID, Customer customer, LocalDateTime orderDateTime, int cartID, float drinkprice, float tableprice) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDateTime = orderDateTime;
        this.cartID = cartID;
        this.drinkprice = drinkprice;
        this.tableprice = tableprice;
        this.totalPrice = calculateTotalPrice();
    }

    // Method to calculate the total price
    private float calculateTotalPrice() {
        return drinkprice + tableprice;
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
    public boolean setcheckOrder() {
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
    public void setDrinkPrice(float drinkprice) {
        this.drinkprice = drinkprice;
        this.totalPrice = calculateTotalPrice();
    }

    // Method to set the table price and recalculate total
    public void setTablePrice(float tableprice) {
        this.tableprice = tableprice;
        this.totalPrice = calculateTotalPrice();
    }
}
