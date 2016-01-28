
public  abstract class Wine implements Drink{
     String flavor;
     String brand;
    
    @Override
    public void alcoholic(){
        boolean alcohol = true;
    }
     public String getFlavor() {
        return flavor;
    }
     public abstract void setFlavor();
     
     public String getBrand(){
         return brand;
     }
    
     public abstract void setBrand();
}
