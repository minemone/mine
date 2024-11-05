
public class CafeSciSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("001", "Alice", "alice@example.com", Role.CUSTOMER);
        customer.performAction("order"); // จะเรียกใช้ฟังก์ชัน orderFood() ของ Customer
    }
}
