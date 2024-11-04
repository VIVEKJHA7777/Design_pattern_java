package FactoryDesignPattern.Problem2;

public class Client {
    public static void main(String[] args) {
        //factory class object...
        BevarageFactory bevarageFactory = new BevarageFactory();

        //object creation from factory class object...
        Beverage coffee = bevarageFactory.getBeverage("coffee");
        Beverage tea = bevarageFactory.getBeverage("tea");
        Beverage juice = bevarageFactory.getBeverage("juice");
        System.out.println();

        //method calling for coffee...
        coffee.prepare();
        String[] coffeeIngre = coffee.getIngredients();
        System.out.println("coffee Ingredients are..");
        for(int i=0;i<coffeeIngre.length;i++){
            System.out.println(coffeeIngre[i]);
        }
        coffee.serve();

        System.out.println();
        //method calling for Tea...
        tea.prepare();
        String[] teaIngre = tea.getIngredients();
        System.out.println("Tea Ingredients are..");
        for(int i=0;i<teaIngre.length;i++){
            System.out.println(teaIngre[i]);
        }
        tea.serve();

        System.out.println();
        //method calling for juice...
        juice.prepare();
        String[] juiceIngre = juice.getIngredients();
        System.out.println("coffee Ingredients are..");
        for(int i=0;i<juiceIngre.length;i++){
            System.out.println(juiceIngre[i]);
        }
        juice.serve();
    }
}
