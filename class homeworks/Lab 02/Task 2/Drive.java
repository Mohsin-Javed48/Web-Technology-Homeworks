// import java.util.Scanner;
import java.util.*;
import java.lang.*;
import javax.swing.*;


abstract class Shape {

    protected double area;
    protected double volume;

    Shape()
    {
        this.area= 0;
        this.volume= 0;
    }
    
    public Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }
    
    // Make getInput() abstract to enforce implementation in subclasses
    public abstract void getInput();
    
    public abstract String toString();
}

class Square extends Shape {
    
    private double length;
    private double width;
    private double height;

    

    public Square(double length, double width, double height) {
        super(length * width, length * width * height);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void getInput() {
        
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length: "));
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter the Width: "));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter the Height: "));
        
        updateAreaAndVolume();
    }
    
    private void updateAreaAndVolume() {
        area = length * width;
        volume = length * width * height;
    }

    @Override
    public String toString() {
        return "The diminsion of square are \n" +
                "\nlength:" + length +
                "\nwidth=" + width +
                "\nheight=" + height +
                "\narea=" + area +
                "\nvolume=" + volume +
                '}';
    }
}

class Sphere extends Shape{
    protected double radius;
    protected static double PI = 3.1416;

    Sphere(){
        super();
        this.radius = 0;
    }

    Sphere(double radius)
    {
        super(4*PI*radius* radius , PI*radius*radius*radius *1.333);
        this.radius = radius;
    }

    public void getInput(){
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the sphere: "));
        updateAreaAndVolume();
    }
    public void updateAreaAndVolume(){
        area = 4 * PI * radius* radius;
        volume = 1.33 * radius*radius* radius * PI;
    }
    public String toString(){
        return "The diminsions of the sphere are:\n " + "Radius " + radius + "\nArea:" + area + "\nVolume:" +volume; 
    }



}


public class Drive {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Square(5, 5, 5);
        shapes[1] = new Sphere(12);
        shapes[2] = new Square(7, 3, 2);
        shapes[3] = new Sphere(2.5);
        shapes[4] = new Square(4, 4, 4);
        shapes[5] = new Shape(1,2);


        // Scanner scanner = new Scanner(System.in); // Replace with suitable GUI input mechanisms

        System.out.println(shapes[1].toString());
        // for (int i =0; i<5; i++) {
        //     System.out.println(shapes.toString());
        // }
    }
}
