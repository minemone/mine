
public class SweetnessLevel {
    private int SweetnessID;
    private String SweetNessName;

    // Constructor
    public SweetnessLevel(int SweetnessID ,String SweetNessName) {
        this.SweetnessID = SweetnessID;
        this.SweetNessName = SweetNessName;
    }

    public int getSweetnessID() {
        return SweetnessID;
    }

    public void setSweetnessID(int SweetnessID) {
        this.SweetnessID= SweetnessID;
    }

    // Method ดึงระดับความหวาน
    public String getSweetnessName() {
        return SweetNessName;
    }

    // Method ตั้งค่าระดับความหวาน
    public void setSweetnessName(String SweetNessName) {
        this.SweetNessName = SweetNessName;
    }

}
