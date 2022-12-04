package projekt;

interface iWolf {
    boolean getAlfaMale();
    void setAlfaMale(boolean alfamale);
}

public class Wolf extends Animal implements iWolf{
    private boolean alfamale;

    public Wolf(String name, String color, int height, int weight, boolean alfamale) {
        super(name, color, height, weight);
        this.alfamale = alfamale;
    }
    
    @Override
    public boolean getAlfaMale(){
        return this.alfamale;
    }
    
    @Override
    public void setAlfaMale(boolean alfamale){
        this.alfamale = alfamale;
    }
}
