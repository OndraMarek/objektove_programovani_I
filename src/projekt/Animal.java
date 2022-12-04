package projekt;

interface iAnimal {
    String getName();
    String getColor();
    int getHeight();
    int getWeight();
    void setName(String name);
    void setColor(String color);
    void setHeight(int height);
    void setWeight(int weight);
}

public class Animal implements iAnimal {
    private String name;
    private String color;
    private int height;
    private int weight;

    public Animal(String name, String color, int height, int weight){
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public String getColor(){
        return this.color;
    }
    
    @Override
    public int getHeight(){
        return this.height;
    }
    
    @Override
    public int getWeight(){
        return this.weight;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public void setHeight(int height){
        this.height = height;
    }
    
    @Override
    public void setWeight(int weight){
        this.weight = weight;
    }
}
