
public abstract class Dragon extends Reptile{
    String name;
    String size;
    int age;
    
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public String getSize(){
        return size;
    }
}
