package Inheritance;

class Shape {
	
    String color;
    int borderWidth;

    // Default constructor
    
    Shape() {
        color = "No Color";
        borderWidth = 0;
    }
    
    // Parameterized Constructor

    Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
        
    }
    
   // Getters and Setters
    
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    int getBorderWidth() {
        return borderWidth;
    }
    void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }    

   // display 
    
    void display() {
        System.out.println("Color : " + this.color);
        System.out.println("Border Width : " + this.borderWidth);
    }
    
}// class shape ends here

class Circle extends Shape {
	
    double radius;

    // Default constructor
    
    Circle() {
        super();
        radius = 0.0;
    }
    
    // Parameterized Constructor

    Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }
    
	// Getters and Setters
    
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }

    // Display 
   
    void display() {
        
        super.display();
        System.out.println("Radius : " + this.radius);
        System.out.println("----------------------------------");
    }
    
}//class circle ends here


class Rectangle extends Shape {
	
    double length;
    double width;
    
    // Default constructor

    Rectangle() {
        super();
        length = 0.0;
        width = 0.0;
    }
    
    // Parameterized Constructor

    Rectangle(String color, int borderWidth, double length, double width) {
        super(color, borderWidth);
        this.length = length;
        this.width = width;
    }
    
    // Getters and Setters
    
    double getLength() {
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }
    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }

    // Display 
    
    void display() {
     
        super.display();
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("----------------------------------");
    }
    
}//class rectangle ends here

class Triangle extends Shape {
	
    double base;
    double height;
    
    // Default constructor
    
    Triangle() {
        super();
        base = 0.0;
        height = 0.0;
    }
    
    // Parameterized Constructor

    Triangle(String color, int borderWidth, double base, double height) {
        super(color, borderWidth);
        this.base = base;
        this.height = height;
    } 

    // Getters and Setters
    
    double getBase() {
        return base;
    }
    void setBase(double base) {
        this.base = base;
    }
    double getHeight() {
        return height;
    }
    void setHeight(double height) {
        this.height = height;
    }

    // Display 
    
    void display() {
        
        super.display();
        System.out.println("Base : " + this.base);
        System.out.println("Height : " + this.height);
        System.out.println("----------------------------------");
    }
    
}//class triangle ends here


public class Sorce_Shape {

	public static void main(String[] args) {
		
		Circle c1 = new Circle("Red", 2, 5.5);
        c1.display();

        Rectangle r1 = new Rectangle("Blue", 3, 8.0, 4.0);
        r1.display();

        Triangle t1 = new Triangle("Green", 1, 6.0, 3.0);
        t1.display();
		
	}

}
