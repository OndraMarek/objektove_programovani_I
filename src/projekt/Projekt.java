package projekt;

public class Projekt {

    public static void main(String[] args) {
        Animal animal = new Animal("ledni medved","bila",130,250); 
        System.out.println("Jmeno: "+ animal.getName());
        System.out.println("Barva: "+ animal.getColor());
        System.out.println("Vyska: "+ animal.getHeight()+ "cm");
        System.out.println("Vaha: "+ animal.getWeight()+ "kg");
        System.out.println("-----------------------");
        Dog dog = new Dog("zlaty retrivr","zlata",56,30,"Jan","Novak");
        System.out.println("Jmeno: "+ dog.getName());
        System.out.println("Barva: "+ dog.getColor());
        System.out.println("Vyska: "+ dog.getHeight()+ "cm");
        System.out.println("Vaha: "+ dog.getWeight()+ "kg");
        System.out.println("Jmeno majitele: "+ dog.getOwnerFName());
        System.out.println("Prijmeni majitele: "+ dog.getOwnerSName());
        System.out.println("-----------------------");
        Wolf wolf = new Wolf("vlk obecny","seda",80,60,true);
        System.out.println("Jmeno: "+ wolf.getName());
        System.out.println("Barva: "+ wolf.getColor());
        System.out.println("Vyska: "+ wolf.getHeight()+ "cm");
        System.out.println("Vaha: "+ wolf.getWeight()+ "kg");
        System.out.println("Alfasamec: "+ wolf.getAlfaMale());
    }
    
}
