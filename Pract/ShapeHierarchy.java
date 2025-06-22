package Pract;
abstract class Shape {
    String color ;

    public Shape(String color){
        this.color = color;
    }
    abstract double area();
    public void diplay(){
        System.out.println(color);
    }
}

class Circle extends Shape{    
    double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
    }
    @Override
    public double area(){
        return  Math.PI * radius*radius;
    }
}
class Rectangle extends Shape{    
     double length;
     double width;
    public Rectangle(String color,  double length, double width ){
        super(color);
         this.length=length;
          this.width =width;
    }
    @Override
    public double area(){
        return length*width;
    }
}
public class ShapeHierarchy {
    public static void main(String[] args){
          Shape circle = new Circle("red", 20);
            circle.diplay();
        System.out.println("Area of Circle: " + circle.area());
    }
}
