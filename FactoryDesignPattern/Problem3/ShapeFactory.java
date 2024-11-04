package FactoryDesignPattern.Problem3;

public class ShapeFactory {
    ShapeFactory(){
        
    }
    public Shape CreateShape(String shapeType, String color,double... dimensions){
        switch(shapeType.toLowerCase()){
            case "circle":
              return new Circle(color,dimensions[0]);
            
            case "rectangle":
                return new Rectangle(color,dimensions[0], dimensions[1]);

            case "triangle":
                return new Triangle(color,dimensions[0], dimensions[1]);
            
            default:
                System.out.println("please select valid shape "+ shapeType);
                return null;
        }
    }
}
