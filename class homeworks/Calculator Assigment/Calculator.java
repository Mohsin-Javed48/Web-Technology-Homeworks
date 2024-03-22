import javax.swing.*;
import java.lang.*;
import java.util.Scanner;

public class Calculator{

    public Calculator()
    {

    }

    public Calculator(Double num1, Double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    double num1;
    double num2;


    public double getNum1()
    {
        return num1;

    }

    public double getNum2()
    {
        return num2;
    }

    public double addNum()
    {
        return this.num1 + this.num2;
    }
    public double substractNum()
    {
        return this.num1 - this.num2;
    }
    public double multiplyNum()
    {
        return this.num1 * this.num2;
    }
    public double divideNum()
    {
        return this.num1 / this.num2;
    }

    public static void main(String[] args)
    {

        
        double num1;
        do
        {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the number 1"));
            
            
        }while(num1 < 0);

        double num2;
        do
        {
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the number 2"));

        }while(num2<0);
        
        Calculator calculator = new Calculator(num1,num2);


        String menu = "1.Add two Numbers\n" + 
       "2.Substract Two Numbers\n" +
        "3.Multiply two numbers\n"+
        "4.Divide two numbers\n";

        

        
        int option= Integer.parseInt(JOptionPane.showInputDialog(menu + "Enter the desired option"));
        
        double result = 0.0;
        switch (option) {
            case 1:
            result = calculator.addNum();
            System.out.println(result);
                break;
            case 2:
            result = calculator.substractNum();
            System.out.println(result);
                break;
            case 3:
            result = calculator.multiplyNum();
            System.out.println(result);
                break;
            case 4:
            result = calculator.divideNum();
            System.out.println(result);
                break;
        
            default:
                option = Integer.parseInt(JOptionPane.showInputDialog("choose the oprion from 1 to 4:"));
                System.exit(0);

            }

            JOptionPane.showMessageDialog(null,"Result = " + result);
    }
}