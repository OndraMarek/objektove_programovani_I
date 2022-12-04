package projekt;

interface iDog {
    String getOwnerFName();
    String getOwnerSName();
    void setOwnerFName(String fname);
    void setOwnerSName(String sname);
}

public class Dog extends Animal implements iDog {
    private String fname;
    private String sname;

    public Dog(String name, String color, int height, int weight, String fname, String sname) {
        super(name, color, height, weight);
        this.fname = fname;
        this.sname = sname;
    }
    
    @Override
    public String getOwnerFName(){
        return this.fname;
    }
    
    @Override
    public String getOwnerSName(){
        return this.sname;
    }
    
    @Override
    public void setOwnerFName(String fname){
       this.fname = fname; 
    }
    
    @Override
    public void setOwnerSName(String sname){
        this.sname = sname;
    }
    
}
