public class Rider extends Person {
    public Rider(String userID, String name) {
        super(userID, name, Role.RIDER); // ใช้ Role.RIDER แทนการเขียนคำว่า "Rider" โดยตรง
    }

    // เมธอดสำหรับดูสถานะการจัดส่งทั้งหมด
    public void viewDeliveryStatus(DeliveryService deliveryService) {
        deliveryService.viewDeliveries();
    }

    // เมธอดสำหรับรับการจัดส่ง
    public void acceptDelivery(DeliveryService deliveryService, int deliveryId) {
        deliveryService.acceptDelivery(deliveryId);
    }

    // เมธอดสำหรับเพิกเฉยการจัดส่ง
    public void ignoreDelivery(DeliveryService deliveryService, int deliveryId) {
        deliveryService.ignoreDelivery(deliveryId);
    }

    // เมธอดสำหรับทำการจัดส่งให้เสร็จสิ้น
    public void completeDelivery(DeliveryService deliveryService, int deliveryId) {
        deliveryService.completeDelivery(deliveryId);
    }
}
