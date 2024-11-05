package BuilderDesignPattern.Problem3;

public class Client {
    public static void main(String[] args) {
        Car mycar = new Car.CarBuilder("V8","Manual",2)
                            .setColor("red")
                            .setGPS(false)
                            .setSunRoof(true)
                            .build();

        System.out.println(mycar);
    }
}
