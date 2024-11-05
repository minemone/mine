import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Drink> drinks = new ArrayList<>();
        PreparationType preparationType1 = new PreparationType(1, "ร้อน", 0);
        PreparationType preparationType2 = new PreparationType(2, "เย็น", 5);
        PreparationType preparationType3 = new PreparationType(3, "ปั่น", 10);

        DrinkCategory teaCategory = new DrinkCategory(1, "ชา");
        DrinkCategory coffeeCategory = new DrinkCategory(2, "กาแฟ");

        SweetnessLevel sweet = new SweetnessLevel(2, "หวานปกติ");
        Topping mook = new Topping(1, "ไข่มุก");

        drinks.add(new Drink(1, "ชาเขียว", 40.0f, sweet, mook, preparationType2, teaCategory, 65));
        drinks.add(new Drink(2, "ชาเย็น", 40.0f, sweet, mook, preparationType2, teaCategory, 52));
        drinks.add(new Drink(3, "กาแฟ", 40.0f, sweet, mook, preparationType2, coffeeCategory, 31));
        drinks.add(new Drink(4, "ลาเต้", 40.0f, sweet, mook, preparationType2, coffeeCategory, 20));
        drinks.add(new Drink(5, "อเมริกาโน่", 40.0f, sweet, mook, preparationType2, coffeeCategory, 10));
        drinks.add(new Drink(6, "มัคคิอาโต้", 40.0f, sweet, mook, preparationType2, coffeeCategory, 5));

        String currentPromotion = "";
        String drinkName = "";
        String drinkType = "";
        int durationDays = 0;

        mainMenuLoop: while (true) {
            System.out.println("=== หน้าหลัก Manager ===");
            System.out.println("1. ขายรายการเครื่องดื่มและระบุโต๊ะ");
            System.out.println("2. ปรับสถานะการสั่งซื้อหรือดูใบเสร็จ");
            System.out.println("3. ปรับสถานะโต๊ะหรือใบเสร็จจองโต๊ะ");
            System.out.println("4. จัดโปรโมชันเพื่อกระตุ้นยอดขายของเครื่องดื่ม");
            System.out.print("กรุณาเลือกเมนู : ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 4) {
                System.out.println("\n=== จัดโปรโมชันเพื่อกระตุ้นยอดขายของเครื่องดื่ม ===");

                System.out.println("\nขายได้มากที่สุด 3 อันดับแรก");
                for (int i = 0; i < Math.min(3, drinks.size()); i++) {
                    Drink drink = drinks.get(i);
                    System.out.println((i + 1) + ". " + drink.getName() + " (ประเภท" + drink.getPreparationType().getPrepName() + ") (ขายได้ " + drink.getSales() + " แก้ว)");
                }

                System.out.println("\nขายได้น้อยที่สุด 3 อันดับแรก");
                for (int i = drinks.size() - 1, rank = 4; i >= Math.max(drinks.size() - 3, 0); i--, rank++) {
                    Drink drink = drinks.get(i);
                    System.out.println(rank + ". " + drink.getName() + " (ประเภท" + drink.getPreparationType().getPrepName() + ") (ขายได้ " + drink.getSales() + " แก้ว)");
                }

                subChoiceLoop: while (true) {
                    System.out.println("\n0. ย้อนกลับ");
                    System.out.print("กรุณาเลือกเมนู : ");
                    int subChoice = scanner.nextInt();

                    if (subChoice == 0) {
                        continue mainMenuLoop;
                    } else if (subChoice >= 1 && subChoice <= drinks.size()) {
                        Drink selectedDrink = drinks.get(subChoice - 1);

                        String rankingTitle = (subChoice <= 3) ? "ขายได้มากที่สุด 3 อันดับแรก" : "ขายได้น้อยที่สุด 3 อันดับแรก";
                        System.out.println("\n=== " + rankingTitle + " (" + selectedDrink.getName() + ") ===");

                        detailChoiceLoop: while (true) {
                            System.out.println("1. ชื่อเครื่องดื่ม (" + (drinkName.isEmpty() ? selectedDrink.getName() : drinkName) + ")");
                            System.out.println("2. ประเภท (" + (drinkType.isEmpty() ? selectedDrink.getPreparationType().getPrepName() : drinkType) + ")");
                            System.out.println("3. เลือกโปรโมชัน (" + (currentPromotion.isEmpty() ? "---" : currentPromotion) + ")");
                            System.out.println("4. ระยะเวลา (" + (durationDays > 0 ? durationDays + " วัน" : "---") + ")");
                            System.out.println("0. ย้อนกลับ");
                            System.out.println("9. บันทึก");
                            System.out.print("กรุณาเลือกเมนู : ");

                            int detailChoice = scanner.nextInt();

                            if (detailChoice == 0) {
                                continue subChoiceLoop;
                            } else if (detailChoice == 1) {
                                System.out.println("\n=== " + rankingTitle + " (" + selectedDrink.getName() + ") ===");
                                System.out.println("ต้องการจัดโปรโมชันเฉพาะ " + selectedDrink.getName() + " หรือทุกเมนู");
                                System.out.println("1. เฉพาะ " + selectedDrink.getName());
                                System.out.println("2. ทุกเมนู");
                                System.out.println("0. ย้อนกลับ");
                                System.out.print("กรุณาเลือกเมนู : ");

                                int promotionChoice = scanner.nextInt();
                                if (promotionChoice == 1) {
                                    drinkName = "เฉพาะ " + selectedDrink.getName();
                                } else if (promotionChoice == 2) {
                                    drinkName = "ทุกเมนู";
                                } else if (promotionChoice == 0) {
                                    continue detailChoiceLoop;
                                } else {
                                    System.out.println("กรุณาเลือกใหม่");
                                }

                            } else if (detailChoice == 2) {
                                System.out.println("\n=== " + rankingTitle + " (" + selectedDrink.getName() + ") === ประเภท (" + selectedDrink.getPreparationType().getPrepName() + ")");
                                System.out.println("1. ทุกประเภท");
                                System.out.println("2. ร้อน");
                                System.out.println("3. ปั่น");
                                System.out.println("0. ย้อนกลับ");
                                System.out.print("กรุณาเลือกเมนู : ");

                                int typeChoice = scanner.nextInt();
                                if (typeChoice == 1) {
                                    drinkType = "ทุกประเภท";
                                } else if (typeChoice == 2) {
                                    drinkType = "ร้อน";
                                } else if (typeChoice == 3) {
                                    drinkType = "ปั่น";
                                } else if (typeChoice == 0) {
                                    continue detailChoiceLoop;
                                } else {
                                    System.out.println("กรุณาเลือกใหม่");
                                }

                            } else if (detailChoice == 3) {
                                System.out.println("\n=== เลือกโปรโมชัน ===");
                                System.out.println("1. จับคู่แก้วที่ 2 ลด 50%");
                                System.out.println("2. ลด 30% สำหรับการซื้อเครื่องดื่มชิ้นที่ 3");
                                System.out.println("0. ย้อนกลับ");
                                System.out.print("กรุณาเลือกโปรโมชัน : ");

                                int promotionSelect = scanner.nextInt();

                                if (promotionSelect == 1) {
                                    currentPromotion = "จับคู่แก้วที่ 2 ลด 50%";
                                } else if (promotionSelect == 2) {
                                    currentPromotion = "ลด 30% สำหรับการซื้อเครื่องดื่มชิ้นที่ 3";
                                } else if (promotionSelect == 0) {
                                    continue detailChoiceLoop;
                                } else {
                                    System.out.println("กรุณาเลือกใหม่");
                                }

                            } else if (detailChoice == 4) {
                                System.out.println("\n=== " + rankingTitle + " (" + selectedDrink.getName() + ") === ");
                                System.out.println("ระยะเวลา (" + (durationDays > 0 ? durationDays + " วัน" : "---") + ")");
                                System.out.println("1. กำหนดระยะเวลา (วัน)");
                                System.out.println("0. ย้อนกลับ");
                                System.out.print("กรุณาเลือกเมนู : ");

                                int timeChoice = scanner.nextInt();
                                if (timeChoice == 1) {
                                    System.out.print("กำหนดระยะเวลา (วัน): ");
                                    durationDays = scanner.nextInt();
                                    System.out.println("ระยะเวลาที่กำหนดไว้: " + durationDays + " วัน");
                                } else if (timeChoice == 0) {
                                    continue detailChoiceLoop;
                                } else {
                                    System.out.println("กรุณาเลือกใหม่");
                                }
                            } /* else if (detailChoice == 9) {
                                Promotion promotion = new Promotion(1, currentPromotion, selectedDrink, durationDays);
                                System.out.println("บันทึกโปรโมชัน: " + promotion.getPromotionName());
                                break mainMenuLoop;
                            } */ else {
                                System.out.println("กรุณาเลือกใหม่");
                            }
                        }
                    } else {
                        System.out.println("กรุณาเลือกใหม่");
                    }
                }
            }
        }
        scanner.close();
    }
}
