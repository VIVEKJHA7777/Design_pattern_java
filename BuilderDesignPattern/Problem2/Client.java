package BuilderDesignPattern.Problem2;

import BuilderDesignPattern.Problem2.Computer.ComputerBuilder;

public class Client {
    public static void main(String[] args) {
        Computer myComputer = new ComputerBuilder("Intel Core i7","16GB","512GB SSD")
                                    .setGraphicCard("NVIDIA GeForce RTX 3070")
                                    .setOperatingSystem("Linux")
                                    .build();

        System.out.println(myComputer);
    }
}