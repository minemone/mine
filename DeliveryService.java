import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeliveryService {
    private Rider rider;
    private List<Delivery> deliveries;

    public DeliveryService(Rider rider) {
        this.rider = rider;
        this.deliveries = new ArrayList<>();
    }

    public void addDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    // แสดงรายการการจัดส่งที่ยังรอดำเนินการ
    public void viewDeliveries() {
        System.out.println("การจัดส่งที่ยังรอดำเนินการสำหรับไรเดอร์: " + rider.getName());
        for (Delivery delivery : deliveries) {
            if (delivery.getStatus().equals("Pending")) {
                delivery.displayDeliveryDetails();
            }
        }
    }

    // รับการจัดส่งที่เลือก
    public void acceptDelivery(int deliveryId) {
        Delivery delivery = findDelivery(deliveryId);
        if (delivery != null && delivery.getStatus().equals("Pending")) {
            delivery.updateStatus("Accepted");
            System.out.println("การจัดส่งหมายเลข " + deliveryId + " ได้รับการยอมรับแล้ว");
        } else {
            System.out.println("การจัดส่งหมายเลข " + deliveryId + " ไม่สามารถรับได้");
        }
    }

    // เพิกเฉยการจัดส่งที่เลือก และลบออกจากรายการ
    public void ignoreDelivery(int deliveryId) {
        Iterator<Delivery> iterator = deliveries.iterator();
        while (iterator.hasNext()) {
            Delivery delivery = iterator.next();
            if (delivery.getDeliveryId() == deliveryId && delivery.getStatus().equals("Pending")) {
                iterator.remove();
                System.out.println("การจัดส่งหมายเลข " + deliveryId + " ถูกเพิกเฉยและลบออกจากรายการ");
                return;
            }
        }
        System.out.println("การจัดส่งหมายเลข " + deliveryId + " ไม่สามารถเพิกเฉยได้");
    }

    // ทำการจัดส่งที่เลือกให้เสร็จสิ้น
    public void completeDelivery(int deliveryId) {
        Delivery delivery = findDelivery(deliveryId);
        if (delivery != null && delivery.getStatus().equals("Accepted")) {
            delivery.updateStatus("Completed");
            System.out.println("การจัดส่งหมายเลข " + deliveryId + " เสร็จสิ้น");
        } else {
            System.out.println("การจัดส่งหมายเลข " + deliveryId + " ไม่สามารถทำให้เสร็จสิ้นได้");
        }
    }

    private Delivery findDelivery(int deliveryId) {
        for (Delivery delivery : deliveries) {
            if (delivery.getDeliveryId() == deliveryId) {
                return delivery;
            }
        }
        return null;
    }
}
