
public abstract class Reptile implements Creature{
   private int age;
   private String size;
    
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public String getSize(){
        return size;
    }
}
