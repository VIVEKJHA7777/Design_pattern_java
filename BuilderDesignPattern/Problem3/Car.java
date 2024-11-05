package BuilderDesignPattern.Problem3;

public class Car {
    private final String engineType;
    private final String transmission;
    private final String color;
    private final boolean GPS;
    private final boolean sunRoof;
    private final int NoofSeats;

    private Car(CarBuilder builder){
        this.engineType=builder.engineType;
        this.transmission=builder.transmission;
        this.color=builder.color;
        this.GPS=builder.GPS;
        this.sunRoof=builder.sunRoof;
        this.NoofSeats=builder.NoofSeats;
    }

    public String getEnginetype(){
        return engineType;
    }
    public String getTransmission(){
        return transmission;
    }
    public String getColor(){
        return color;
    }
    public boolean getGPS(){
        return GPS;
    }
    public boolean getSunRoof(){
        return sunRoof;
    }
    public int getSeats(){
        return NoofSeats;
    }

    public static class CarBuilder{
    private final String engineType;
    private final String transmission;
    private final int NoofSeats;
    private String color;
    private boolean GPS;
    private boolean sunRoof;

        public CarBuilder(String engineType,String transmision,int seats) {
            this.engineType = engineType;
            this.transmission = transmision;
            this.NoofSeats = seats;
        }
        public CarBuilder setColor(String color){
            this.color=color;
            return this;
        }
        public CarBuilder setGPS(boolean GpsVal){
            this.GPS=GpsVal;
            return this;
        }
        public CarBuilder setSunRoof(boolean sunRoofval){
            this.sunRoof=sunRoofval;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
    @Override
    public String toString(){
        return "Car  [Engine Type ="+ engineType + ", Transmission="+transmission+", Color="+color+", GPS=" +GPS+", sunroof="+sunRoof+", Seats="+NoofSeats+"]";
    }
}
