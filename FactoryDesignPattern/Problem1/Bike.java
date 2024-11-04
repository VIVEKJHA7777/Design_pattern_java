package FactoryDesignPattern.Problem1;

public class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Bike is stopping...");
    }

    @Override
    public String getFuelType(){
        return "Diesel";
    }
    
}
