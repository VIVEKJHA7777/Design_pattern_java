package BuilderDesignPattern.Problem2;

public class Computer {
    private final String processor;
    private final String RAM;
    private final String storage;
    private final String GraphicCard;
    private final String operatingSystem;

    private Computer(ComputerBuilder builder){
        this.processor=builder.processor;
        this.RAM= builder.RAM;
        this.storage=builder.storage;
        this.GraphicCard=builder.GraphicCard!=null?builder.GraphicCard:null;
        this.operatingSystem=builder.operatingSystem!=null?builder.operatingSystem:null;
    }

    public String getProcessor(){
        return processor;
    }
    public String getRAM(){
        return RAM;
    }
    public String getStorage(){
        return storage;
    }
    public String getGraphicCard(){
        return GraphicCard;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }

    public static class ComputerBuilder{
    private final String processor;
    private final String RAM;
    private final String storage;
    private String GraphicCard;
    private String operatingSystem;

    public ComputerBuilder(String processor, String ram, String storage) {
        this.processor = processor;
        this.RAM = ram;
        this.storage = storage;
    }
    public ComputerBuilder setGraphicCard(String graphic){
        this.GraphicCard=graphic;
        return this;
    }
    public ComputerBuilder setOperatingSystem(String Opssystem){
        this.operatingSystem=Opssystem;
        return this;
    }
    public Computer build(){
        return new Computer(this);
    }

    }
    @Override
    public String toString() {
        return "Computer [Processor=" + processor + ", RAM=" + RAM + ", Storage=" + storage +
               ", Graphics Card=" + (GraphicCard != null ? GraphicCard : "None") +
               ", OS=" + (operatingSystem != null ? operatingSystem : "None") + "]";
    }
}
