package FactoryDesignPattern.Problem3;

public class Rectangle implements Shape{
    private double length;
    private double breadth;
    private String Rectanglecolor;

    Rectangle(String color,double length,double breadth){
        this.length=length;
        this.breadth=breadth;
        this.Rectanglecolor=color;
    }
    @Override
    public void draw(){
        System.out.println("Drawing of rectangle of length "+ length +"cm and breadth "+ breadth + "cm");
    }
    @Override
    public double getArea(){
        return length*breadth;
    }
    @Override
    public String color(){
        return Rectanglecolor;
    }

}
