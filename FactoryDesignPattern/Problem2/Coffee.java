package FactoryDesignPattern.Problem2;

public class Coffee implements Beverage{

    Coffee(){
        System.out.println("object created for Coffee class...");
    }
    @Override
    public void prepare(){
        System.out.println("Coffee is preparing...");
    }

    @Override
    public void serve(){
        System.out.println("Cofee is serving...");
    }

    public String[] getIngredients(){
        return new String[]{"milk", "Coffee Powder", "Sugar"};
    } 
}
