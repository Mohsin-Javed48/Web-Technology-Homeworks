import java.lang.*;
import java.util.*;

class Student{
    //defining variables
    private int rollNo;
    private String name;
    private String email;
    private String adress;
    //Default Constructor
    Student()
    {
     rollNo = 0;
     name = "";
     email ="";
     adress ="";
    }
    //Parameterized Constructor
    Student(int rollNo, String name,  String email, String adress)
    {
     this.rollNo = rollNo;
     this.name = name;
     this.email =email;
     this.adress =adress;
    }
    //Copy Costructor
    Student(Student obj){
        this.rollNo = obj.rollNo;
        this.name = obj.name;
        this.email =obj.email;
        this.adress =obj.adress;
    }

    //All setters for Data members
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
     this.email =email;
    }
    public void setAdress(String adress){
     this.adress =adress;
    }

    //All Getters for data members
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getEmail (){
        return email;
    }
    public String getAdress(){
        return adress ;
    }

    //Taking input from user
    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Roll Number: ");
        rollNo  = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Name: ");
        name  = scanner.nextLine();

        System.out.println("Enter Your Email Adress: ");
        email  = scanner.nextLine();

        System.out.println("Enter Your Resential Adress: ");
        adress  = scanner.nextLine();
        
    }

    //Display Data of an instance
    void displayData(){
        System.out.println("The Data for a student is:\n" + "ROllNo:" + rollNo + "\nName: " + name + "\nEmail: " + email + "\nResendial Adress: "+ adress);
    }

    // main function
    public static void main(String args[]){
        //Creating array of objects
        Student[] obj = new Student[5];
        //call defalt constructor
        obj[0] = new Student();
        
        obj[0].inputData();
        obj[0].displayData();




    }
}