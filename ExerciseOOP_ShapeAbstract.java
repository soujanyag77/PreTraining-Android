public abstract class Shape {
	protected String color;
	protected boolean filled;
    
	public Shape(){
}
	public Shape(String initialColor,boolean initialfilled){
}
	public String getColor(){
}
	public void setColor(String newColor){
}
	public boolen isFilled(){
}
	public void setFilled(boolean newFilled){
}
	public abstract double getArea(){
}
	public abstract double getPerimeter(){
}
	public abstract String toString(){
}

}


public class Circle extends Shape {

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
	public double getRadius(){
}
	public void setRadius(){
}
    
    public double area() {
        
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
       
        return 2 * pi * radius;
    }
	public String toString(){
}
}  


public class Rectangle extends Shape {
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
	public double getWidth(){
}
	public double getLength(){
}
	public double setLength(){
}

	public double setWidth(){
}

public String toString(){
}


}

public class Square extends Rectangle {
    protected double side; 
    public Square() {
        
    }
    public Square(double side) {
        this.side = side;
    }
public Squre(double side,String color,boolen filled) {
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
	public double getSide(){
}

	public double setSide(){
}

public String toString(){
}

}

public class ass2 {
    public static void main(String[] args) {
		
}

}
