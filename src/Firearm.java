
public abstract class Firearm implements Weapon {
    
    String caliber;
    String brand;   
    
    public  String  getCaliber(){
        return caliber;
    }
    
    public abstract void setCaliber(String caliber);
   
    public  String getBrand(){
        return brand;
    }
       
    public abstract void setBrand(String brand);
}
