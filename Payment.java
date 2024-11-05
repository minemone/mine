
import java.util.Scanner;

public class Payment {
    private int paymentId;
    private double amount;
    private String method; // e.g., "QR", "Credit Card"
    private Order order;

    // Constructor
    public Payment(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    // Method to process payment
    public void processPayment() {
        if (method.equalsIgnoreCase("QR")) {
            System.out.println("กำลังดำเนินการชำระเงินผ่าน QR Code...");
            System.out.println("กรุณาสแกน QR Code ด้วยแอปธนาคารของคุณ");
        } else if (method.equalsIgnoreCase("Credit Card")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("กรุณาใส่หมายเลขบัตรเครดิต: ");
            String cardNumber = scanner.nextLine();
            System.out.print("ชื่อผู้ถือบัตร: ");
            String cardHolderName = scanner.nextLine();
            System.out.print("วันหมดอายุ (MM/YY): ");
            String expirationDate = scanner.nextLine();
            System.out.print("CVV: ");
            String cvv = scanner.nextLine();

            CreditCard creditCard = new CreditCard(cardNumber, cardHolderName, expirationDate, cvv);
            if (creditCard.validateCard()) {
                System.out.println("การชำระเงินผ่านบัตรเครดิตเสร็จสมบูรณ์");
            } else {
                System.out.println("ข้อมูลบัตรเครดิตไม่ถูกต้อง กรุณาลองใหม่อีกครั้ง");
            }
        } else {
            System.out.println("วิธีการชำระเงินไม่ถูกต้อง");

        }
          // สร้างใบเสร็จหลังจากชำระเงินเสร็จสิ้น
          Receipt receipt = new Receipt(order);
          receipt.printReceipt(); // แสดงใบเสร็จ
    }

    public void processPayment(Order order) {
        if (order != null) {
            Receipt receipt = new Receipt(order);
            receipt.printReceipt();
        } else {
            System.out.println("ไม่สามารถสร้างใบเสร็จได้ เนื่องจากคำสั่งซื้อเป็น null");
        }
    }
}
