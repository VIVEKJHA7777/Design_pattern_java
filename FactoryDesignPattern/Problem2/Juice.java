package FactoryDesignPattern.Problem2;

public class Juice implements Beverage{

    Juice(){
        System.out.println("Object created for Juice class...");
    }
    @Override
    public void prepare(){
        System.out.println("Juice is preparing...");
    }
    @Override
    public void serve(){
        System.out.println("Juice is serving...");
    }
    @Override
    public String[] getIngredients(){
        return new String[]{"Orange","water"};
    }
}
