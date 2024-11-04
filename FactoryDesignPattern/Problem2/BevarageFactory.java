package FactoryDesignPattern.Problem2;

public class BevarageFactory {
    public Beverage getBeverage(String beverageType){
        if(beverageType==null) return null;

        switch(beverageType.toLowerCase()){
            case "coffee":
                return new Coffee();
            
            case "juice":
                return new Juice();
            
            case "tea":
               return new Tea();
            
            default:
                System.out.println("please order mention beverage in the menu" + beverageType);
                return null;
        }

    }
}
