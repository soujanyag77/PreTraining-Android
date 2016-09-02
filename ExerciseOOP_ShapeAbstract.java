public abstract class Shape {
	protected String color;
	protected boolen filled;
    
	public Shape(){
}
	public Shape(String initialColor,boolen initiallyfilled){
}
	public String getColor(){
}
	public void setColor(String newColor){
}
	public boolen isFilled(){
}
	public void setFilled(boolen newFilled){
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
    public Circle(double radius,String color,boolen filled) {
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
	public abstract String toString(){
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
public Rectangle(double width, double length,String color,boolen filled) {
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
}

public class Square extends Rectangle {
    protected double width, length; 
    public Rectangle() {
        
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
public Rectangle(double width, double length,String color,boolen filled) {
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
}

public class ass2 {
    public static void main(String[] args) {
}

}
}