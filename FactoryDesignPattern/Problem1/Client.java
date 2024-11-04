package FactoryDesignPattern.Problem1;

public class Client {
    public static void main(String args[]){

        //object creation.....
        VehicleFactory vec=new VehicleFactory();
        Vehicle car = vec.getVehicle("Car");
        Vehicle bike = vec.getVehicle("bike");
        Vehicle truck = vec.getVehicle("truck");
        
        //calling methods....
        car.start();
        System.out.println("fuel type is "+car.getFuelType());
        car.stop();
        System.out.println();

        bike.start();
        System.out.println("fuel type is "+bike.getFuelType());
        bike.stop();
        System.out.println();

        truck.start();
        System.out.println("fuel type is "+truck.getFuelType());
        truck.stop();

    }
}
