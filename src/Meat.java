
public abstract class Meat implements Food {
    private String proteinLevel;
    
    public String getProLevel() {
        return proteinLevel;
    }
    public void setProLevel(String proteinLevel) {
        this.proteinLevel = "high";
    }
}
