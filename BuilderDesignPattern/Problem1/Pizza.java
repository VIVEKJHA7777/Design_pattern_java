package BuilderDesignPattern.Problem1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String size;
    private final String crust;
    private final String cheeseType;
    private final List<String>Toppings;
    private final List<String>extras;

    private Pizza(pizzaBuilder builder){
        this.size=builder.size;
        this.crust=builder.crust;
        this.cheeseType=builder.cheeseType;
        this.Toppings=builder.Toppings;
        this.extras=builder.extras;
    }

    public String getSize(){
        return size;
    }
    public String getCrust(){
        return crust;
    }
    public String getCheeseType(){
        return cheeseType;
    }
    public List<String> getToppings(){
        return Toppings;
    }
    public List<String> getExtras(){
        return extras;
    }

    @Override
    public String toString(){
        return "Pizza [Size=" + size + ", Crust=" + crust + ", Cheese=" + cheeseType +
                ", Toppings=" + Toppings + ", Extras=" + extras + "]";
    }

    public static class pizzaBuilder{
        private String size;
        private String crust;
        private String cheeseType;
        private List<String>Toppings=new ArrayList<>();
        private List<String>extras = new ArrayList<>();

        public pizzaBuilder setSize(String size){
            this.size=size;
            return this;
        }
        public pizzaBuilder setCrust(String crust){
            this.crust=crust;
            return this;
        }
        public pizzaBuilder setCheeseType(String cheeseType){
            this.cheeseType=cheeseType;
            return this;
        }
        public pizzaBuilder setToppings(String topping){
            this.Toppings.add(topping);
            return this;
        }
        public pizzaBuilder setExtras(String extra){
            this.extras.add(extra);
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
