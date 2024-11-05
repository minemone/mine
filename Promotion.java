import java.util.Date;

public class Promotion {
    private String promotionName;
    private double discountRate;
    private Date validUntil;

    // Constructor
    public Promotion(String promotionName, double discountRate, Date validUntil) {
        this.promotionName = promotionName;
        this.discountRate = discountRate;
        this.validUntil = validUntil;
    }

    // Method to apply promotion
    public double applyPromotion(double originalPrice) {
        if (new Date().before(validUntil)) {
            double discountedPrice = originalPrice * (1 - discountRate / 100);
            System.out.println("Promotion applied: " + promotionName);
            return discountedPrice;
        } else {
            System.out.println("Promotion expired.");
            return originalPrice;
        }
    }

    // Method to display promotion details
    public void displayPromotion() {
        System.out.println("Promotion: " + promotionName);
        System.out.println("Discount: " + discountRate + "%");
        System.out.println("Valid Until: " + validUntil);
    }
}
