package FactoryDesignPattern.Problem3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeCreator = new ShapeFactory();
        //creating object...
        Shape circle = shapeCreator.CreateShape("circle", "red", 5.0);
        Shape rectangle = shapeCreator.CreateShape("rectangle", "yellow", 5.0,4.0);
        Shape triangle = shapeCreator.CreateShape("triangle", "orange", 5.0,4.0);

        //calling method for circle...
        circle.draw();
        System.out.println("Area of circle is "+ circle.getArea());
        System.out.println("Color of circle is "+ circle.color());
        System.out.println();

        //calling method for rectangle...
        rectangle.draw();
        System.out.println("Area of Rectangle is "+ rectangle.getArea());
        System.out.println("Color of Rectangle is "+ rectangle.color());
        System.out.println();

        //calling method for Triangle...
        triangle.draw();
        System.out.println("Area of Triangle is "+ triangle.getArea());
        System.out.println("Color of Triangle is "+ triangle.color());
        
    }
}
