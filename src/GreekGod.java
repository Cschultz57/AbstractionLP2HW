
public abstract class GreekGod implements MythologicalTopic {
    String name;
    String realm;
    
    public String getName(){
        return name;
    }
    
    public abstract void setName();
    
    public String getRealm(){
        return realm;
    }
    
    public abstract void setRealm();
}
