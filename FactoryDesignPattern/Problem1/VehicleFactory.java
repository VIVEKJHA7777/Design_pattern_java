package FactoryDesignPattern.Problem1;

public class VehicleFactory {
    public Vehicle getVehicle(String VehicleType){
        if(VehicleType==null){
            return null;
        }
        
        switch(VehicleType.toLowerCase()){
            case "car": 
                return new Car();
            
            case "bike":
                return new Bike();
            
            case "truck":
                return new Truck();
            
            default:
                System.out.println("Unknown Vehicle Type " + VehicleType);
                return null;

        }
    }
}
