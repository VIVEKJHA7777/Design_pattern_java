package FactoryDesignPattern.Problem3;

public class Circle implements Shape{
    private double radius;
    private String Circlecolor;

    Circle(String color,double radius){
        this.radius=radius;
        this.Circlecolor=color;
    }
    @Override
    public void draw(){        
        System.out.println("Drawing a circle with radius "+ radius);
    }

    @Override
    public String color(){
        return Circlecolor;
    }

    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
}
