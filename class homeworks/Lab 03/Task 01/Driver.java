import java.lang.*;
import javax.swing.*;
import java.util.*;

abstract class Shape{
    protected double area;
    protected double perimeter;

    Shape(){
        this.area = 0.0;
        this.perimeter = 0.0;
    }
    Shape(double area, double perimeter){
        this.area = area;
        this.perimeter = perimeter;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();

}



class Square extends Shape{
    protected Double length;
    protected Double width;

    Square(){
        super();
        this.length = 0.0;
        this.width = 0.0;
    }
    Square(double length, double width){
        super(length*width, 2* length* width);
        
        this.length = length;
        this.width = width;
    }
    Square(Square obj){
        this.length = obj.length;
        this.width = obj.width;

        upDateArea();
        upDatePerimeter();
    }

    void upDateArea(){
        area= length* width;
    }
    void upDatePerimeter(){
        perimeter = 2* length* width;
    }
    
    public double calculateArea(){
        double area = length * width;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2 * length * width;
        return perimeter;
    }
    public String toString(){
        return "The Diminsions of Square are: \n" + 
        "The length of Square is: " + length
         +" \nThe Width of Square is: " + width 
         + "\nThe Area of Square is: " + area
         +"\nThe Perimeter of Square is: " + perimeter; 
    }
}



class Rectangle extends Shape{
    protected Double length;
    protected Double width;
    
    Rectangle(){
        super();
        this.length = 0.0;
        this.width = 0.0;
    }
    Rectangle(double length, double width){
        super(length*width, 2* (length +  width));
        this.length = length;
        this.width = width;
    }
    Rectangle(Rectangle obj){
        this.length = obj.length;
        this.width = obj.width;
        upDateArea();
        upDatePerimeter();
    }

    void upDateArea(){
        area= length* width;

        
    }
    void upDatePerimeter(){
        perimeter = 2* (length + width);
    }
    
    public double calculateArea(){
        double area = length * width;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    public String toString(){
        return "The Diminsions of Rectangle are: \n" + 
        "The length of Rectangle is: " + length
         +" \nThe Width of Rectangle is: " + width 
         + "\nThe Area of Rectangle is: " + area
         +"\nThe Perimeter of Rectangle is: " + perimeter; 
    }

}



class Circle extends Shape{
    protected Double radius;
    protected final Double PI = 3.1416;

    Circle(){
        super();
        this.radius = 0.0;
     
    }
    Circle(double radius){
        super(3.1416 * radius * radius , 2* 3.1416 * radius);   
        this.radius = radius;
    }
    Circle(Circle obj){
        this.radius = obj.radius;
        upDateArea();
        upDatePerimeter();
    }

    void upDateArea(){
        area= PI * radius* radius;
    }
    void upDatePerimeter(){
        area= 2* PI * radius;

    }
    
    public double calculateArea(){
        double area = PI * radius * radius;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    public String toString(){
        return "The Diminsions of Circle are: \n" + 
        "The Radius of Circle is: " + radius
         + "\nThe Area of Circle is: " + area
         +"\nThe Perimeter of Circle is: " + perimeter; 
    }

}

public class Driver{
    public static void main(String[]  args)
    {
        Shape[] arr = new Shape[5];
        
        arr[0] = new Square(12,12);
        System.out.println(arr[0].toString());

        arr[1] = new Circle(12);
        System.out.println(arr[1].calculateArea());

        arr[2] = new Rectangle(12,12);
        System.out.println(arr[2].toString());
        
    }
}