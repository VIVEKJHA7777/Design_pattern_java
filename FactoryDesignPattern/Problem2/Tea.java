package FactoryDesignPattern.Problem2;

public class Tea implements Beverage{

    Tea(){
        System.out.println("object created for Tea class...");
    }
    @Override
    public void prepare(){
        System.out.println("Tea is preparing...");
    }
    @Override
    public void serve(){
        System.out.println("Tea is serving...");
    }
    @Override
    public String[] getIngredients(){
        return new String[]{"Milk","Water","Sugar","Tea leaves"};
    }
}
