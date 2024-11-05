
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Order> orderHistory;

    // Constructor
    public Customer(String personID, String name, String email, Role role) {
        super(personID, name, role);
        this.orderHistory = new ArrayList<>();
    }

    // Method to add an order to the history
    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

}
