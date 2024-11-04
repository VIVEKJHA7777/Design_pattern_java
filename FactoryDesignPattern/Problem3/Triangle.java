package FactoryDesignPattern.Problem3;

public class Triangle implements Shape{
    private double base;
    private double height;
    private String TriangleColor;

    Triangle(String color,double base, double height){
        this.base=base;
        this.height=height;
        this.TriangleColor=color;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a Triangle with base is "+ base + "cm and height is "+ height + "cm");
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    @Override
    public String color(){
        return TriangleColor;
    }
}
