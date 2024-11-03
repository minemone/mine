import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // สร้างตัวอย่างลูกค้า
        Customer[] customers = {
            new Customer("John Doe", "123-456-7890", "john.doe@example.com", "C001", 50.0f),
            new Customer("Jane Smith", "234-567-8901", "jane.smith@example.com", "C002", 50.0f),
            new Customer("Michael Brown", "345-678-9012", "michael.brown@example.com", "C003", 50.0f),
            new Customer("Emily Davis", "456-789-0123", "emily.davis@example.com", "C004", 50.0f),
            new Customer("David Wilson", "567-890-1234", "david.wilson@example.com", "C005", 50.0f)
        }; // เพิ่มปิดวงเล็บตรงนี้
        

        // สร้างตัวอย่างโต๊ะ
        Cafetable[] tables = {
            new Cafetable(1, "Table 1", 5.0f),
            new Cafetable(2, "Table 2", 5.0f),
            new Cafetable(3, "Table 3", 5.0f),
            new Cafetable(4, "Table 4", 5.0f),
            new Cafetable(5, "Table 5", 5.0f)
        };

        // สร้างตัวอย่างเครื่องดื่ม
        Drink[] drinks = {
            new Drink(101, "ชาเขียว", 35.0f),
            new Drink(102, "นมสด", 35.0f),
            new Drink(103, "โกโก้", 35.0f),
            new Drink(104, "ชาไทย", 35.0f),
            new Drink(105, "นมชมพู", 35.0f)
        };

        // สร้างตัวอย่างคำสั่งซื้อและการชำระเงิน
        for (int i = 0; i < 5; i++) {
            // Get drinkPrice and tablePrice
            float drinkPrice = drinks[i].getPrice();
            float tablePrice = tables[i].getTablePrice();

            // Calculate totalPrice = drinkPrice + tablePrice
            float totalPrice = drinkPrice + tablePrice;

            // Create an order using totalPrice
            Order order = new Order(i + 1, customers[i], LocalDateTime.now(), tables[i].getCafetableID(), drinkPrice, tablePrice);

            // Create payment
            Payment payment = new Payment(123 + i, "QR code", order.getOrderID(), customers[i].getCustomerId(), totalPrice);

            // สร้างตัวอย่างใบเสร็จ
            Receipt receipt = new Receipt(1 + i, payment.getPaymentID(), customers[i].getCustomerId(), payment.getTotalPrice(), 0.0f);

            // สร้างตัวอย่างโปรโมชั่น
            Promotion promotion = new Promotion("-", drinks[i].getName(), new Date());

            // สร้างตัวอย่างไรเดอร์
            Rider rider = new Rider("Rider " + (i + 1), "123-456-789" + i, "rider" + i + "@example.com", "R00" + (i + 1));
            // แสดงผลข้อมูล
            System.out.println("ลูกค้า: " + customers[i].getName());
            tables[i].showDetailsOfTable();
            drinks[i].setSweetnessLevel("ปกติ");
            System.out.println("เครื่องดื่มที่สั่ง: " + drinks[i].getName() + ", ระดับความหวาน: " + drinks[i].getSweetness().getSweetnessLevel());
            System.out.println("รายละเอียดคำสั่งซื้อ: " + order.getOrderDetails());
            System.out.println("วิธีการชำระเงิน: " + payment.getPaymentMethod());
            receipt.getReceiptDetails();
            System.out.println("โปรโมชั่น: " + promotion.getName());
            rider.showRealTimeDeliveryStatus(order);
            System.out.println("--------------------------------------------------");
        }
    
    }
}
