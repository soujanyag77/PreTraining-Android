abstract class Shape {
	protected String color;
	protected boolean filled;
    
	public Shape(){
}
	public Shape(String initialColor,boolean initialfilled){
}
	public String getColor(){return this.color;
}
	public void setColor(String newColor){
}
	public boolean isFilled(){return this.filled;
}
	public void setFilled(boolean newFilled){
}
	public abstract double getArea();

	public abstract double getPerimeter();
	public abstract String toString();

}


abstract class Circle extends Shape {

	protected double radius;
	
	 final double pi = Math.PI;

    public Circle() {

    }   
    public Circle(double radius,String color,boolean filled) {
        this.radius = radius;
	this.color = color;
	this.filled = filled;
    }
	public Circle(double radius) {
        this.radius = radius;
    }
	public double getRadius(){return this.radius;
}
	public void setRadius(){
}
    
    public double area() {
        
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
       
        return 2 * pi * radius;
    }
	public String toString(){return ""+this.color;
}
}  


abstract class Rectangle extends Shape {
    protected double width, length; 
    public Rectangle() {
        
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
public Rectangle(double width, double length,String color,boolean filled) {
        this.width = width;
        this.length = length;
	this.color=color;
	this.filled=filled;
    }
   
    public double area() {
        
        return width * length;
    }

   
    public double perimeter() {
        
        return 2 * (width + length);
    }
	public double getWidth(){return this.width;
}
	public double getLength(){return this.length;
}
	public void setLength(){
}

	public void setWidth(){
}

public String toString(){return ""+this.length;
}


}

abstract class Square extends Rectangle {
    protected double side; 
    public Square() {
        
    }
    public Square(double side) {
        this.side = side;
    }
public Square(double side,String color,boolean filled) {
        this.side = side;
	this.color=color;
	this.filled=filled;
    }
   
    public double area() {
        
        return side * side;
    }

   
    public double perimeter() {
        
        return 2 * side;
    }
	public double getSide(){return this.side;
}

	public void setSide(){
}

public String toString(){return ""+this.length;
}

}

public class ass2 {
    public static void main(String[] args) {
		
}

}
