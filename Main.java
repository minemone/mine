import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to CafeSci!\n");
        
        // Sample menu
        Menu menu = new Menu();
        menu.addDrink(new Drink("Espresso", 50));
        menu.addDrink(new Drink("Latte", 70));
        menu.addDrink(new Drink("Cappuccino", 65));
        menu.addDrink(new Drink("Mocha", 75));
        menu.addDrink(new Drink("Thai Tea", 55));
        menu.addDrink(new Drink("Milk", 30));
        menu.addDrink(new Drink("Strawberry Milk", 55));
        menu.addDrink(new Drink("Matcha Latte", 85));
        menu.addDrink(new Drink("Milk with Honey", 45));
        menu.addDrink(new Drink("Chocolate Milk", 50));
        menu.addTopping(new Topping("Whipped Cream", 15));
        menu.addTopping(new Topping("Vanilla Syrup", 10));
        menu.addTopping(new Topping("Caramel Drizzle", 15));
        menu.addTopping(new Topping("Chocolate Sauce", 15));
        menu.addTopping(new Topping("Cinnamon Powder", 5));
        menu.addTopping(new Topping("Hazelnut Syrup", 10));
        menu.addTopping(new Topping("Almond Milk", 20));
        menu.addTopping(new Topping("Soy Milk", 20));
        menu.addTopping(new Topping("Oat Milk", 20));
        menu.addTopping(new Topping("Marshmallows", 15));
        menu.addTopping(new Topping("Ice Cream Scoop", 25));
        menu.addTopping(new Topping("Honey", 10));

        // Display menu
        menu.displayMenu();

        // Create a customer and take an order
        System.out.print("\nEnter your name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter your address: ");
        String customerAddress = scanner.nextLine();

        Customer customer = new Customer(customerName, customerAddress);
        System.out.println("\nHello, " + customer.getName() + "! Let's take your order.");

        Order order = new Order(customer);

        while (true) {
            System.out.print("\nEnter the name of the drink you want to add (or type 'done' to finish): ");
            String drinkName = scanner.nextLine();
            if (drinkName.equalsIgnoreCase("done")) {
                break;
            }
            Drink drink = menu.getDrink(drinkName);
            if (drink != null) {
                order.addDrink(drink);
            } else {
                System.out.println("Sorry, that drink is not on the menu.");
            }
        }

        while (true) {
            System.out.print("\nEnter the name of the topping you want to add (or type 'done' to finish): ");
            String toppingName = scanner.nextLine();
            if (toppingName.equalsIgnoreCase("done")) {
                break;
            }
            Topping topping = menu.getTopping(toppingName);
            if (topping != null) {
                order.addTopping(topping);
            } else {
                System.out.println("Sorry, that topping is not on the menu.");
            }
        }

        // Show order summary
        System.out.println("\nOrder Summary:");
        order.getOrderDetails();

        // Payment process
        System.out.print("\nEnter payment method (e.g., 'Credit Card', 'Cash'): ");
        String paymentMethod = scanner.nextLine();
        Payment payment = new Payment(order.calculateTotalPrice(), paymentMethod);
        System.out.println("\nProcessing payment...");
        payment.processPayment();

        // Generate receipt
        Receipt receipt = new Receipt(order);
        System.out.println("\nReceipt:");
        receipt.printReceipt();

        scanner.close();
    }
}