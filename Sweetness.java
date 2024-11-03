public class Sweetness {
    private int sweetNessID;
    private String sweetNessLevel;

    // Constructor
    public Sweetness(String sweetNessLevel) {
        this.sweetNessLevel = sweetNessLevel;
    }

    // Method ดึงระดับความหวาน
    public String getSweetnessLevel() {
        return sweetNessLevel;
    }

    // Method ตั้งค่าระดับความหวาน
    public void setSweetnessLevel(String sweetNessLevel) {
        this.sweetNessLevel = sweetNessLevel;
    }
}
