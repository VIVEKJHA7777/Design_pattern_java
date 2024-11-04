package FactoryDesignPattern.Problem1;

public class Truck implements Vehicle{
    @Override
    public void start(){
        System.out.println("Truck is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Truck is stopping...");
    }

    @Override
    public String getFuelType(){
        return "Electric";
    }

}
