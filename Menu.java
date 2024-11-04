import java.util.ArrayList;
import java.util.List;

class Menu {
    private List<Drink> drinks = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public Drink getDrink(String name) {
        for (Drink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name)) {
                return drink;
            }
        }
        return null;
    }

    public Topping getTopping(String name) {
        for (Topping topping : toppings) {
            if (topping.getToppingName().equalsIgnoreCase(name)) {
                return topping;
            }
        }
        return null;
    }

    public void displayMenu() {
        System.out.println("Drinks:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + ": " + drink.getPrice() + " THB");
        }
        System.out.println("\nToppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getToppingName() + ": " + topping.getPrice() + " THB");
        }
    }
}
