abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
        
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.area());
    }
}