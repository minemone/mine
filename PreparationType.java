
public class PreparationType {
    private int prepID;
    private String prepName; // เช่น "ร้อน", "เย็น", "ปั่น"
    private float prepprice;

    // Constructor
    public PreparationType(int prepID, String prepName,float prepprice) {
        this.prepID = prepID;
        this.prepName = prepName;
        this.prepprice = prepprice;
    }

    public int getPrepID() {
        return prepID;
    }

    public String getPrepName() {
        return prepName;
    }

    public float getPreppice() {
        return prepprice;
    }

    public void setPrepID(int prepID) {
        this.prepID= prepID;
    }

    public void setprepName(String prepName) {
        this.prepName =prepName; 
    }

    public void setprepprice(float prepprice) {
        this.prepprice= prepprice;
    }
}




    


