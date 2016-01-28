
public class Pistol extends Firearm {

    @Override
    public void setCaliber(String Caliber){
        this.caliber = "9mm"; // For the example. Normally I would make these enums.
    }
    @Override
    public void setBrand(String Brand){
        this.brand= "Springfield";
    }
}
