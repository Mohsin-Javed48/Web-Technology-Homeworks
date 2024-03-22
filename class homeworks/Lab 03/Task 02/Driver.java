import java.lang.*;
import javax.swing.*;
import java.util.*;

//Creating Interface 
    // A class having abstract methods is called interface.

interface Media {
    void display(); //Public + abstract method
    
}

//Creating implement Class of Media
abstract class PrintMedia implements Media{
    protected String title;
    
}

//Creating implement class of Media 
abstract class SocialMedia implements Media{
    protected String title;

}

//Creating inherit class of print media
class Book extends PrintMedia{
    protected String name; 
    protected String ISBN;

    Book(){
     
    }
    Book(String title, String name, String ISBN){
        this.title = title;
        this.name = name;
        this.ISBN = ISBN;
    }

    public void setName(String name){
        this.name = name;
    }  

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    } 

    String getName(){
        return this.name;
    }

    String getISBN(){
        return this.ISBN;
    }

    String getTitle(){
        return this.title;
    }

    public void display(){ //override method  
        System.out.println("The Title of Book: " + title + "\nThe Name of Book:" + name + "\nThe ISBN of Book: "+ ISBN  );
    }

}

//Creating inherit class of print media
class Magazine extends PrintMedia{
    protected String month;
    protected int year;

    Magazine(){
        this.year = 0;
    }
    Magazine(String title,String month, int year){
        this.title = title;
        this.month = month;
        this.year = year;
    }

    public void setTitle(String title){
        this.title = title;
    } 

    public void setMonth(String month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    String getTitle(){
        return title;
    }

    String getMonth(){
        return month;
    } 

    int getYear(){
        return year;
    }  

    public void display(){ //override 
        System.out.println("The Title of Magazine: " + title + "\nThe Month of Magazine:" +  month+ "\nThe Year of Magazine: " + year  );
    } 

}



//Creating inherit class of social media
class FaceBook extends SocialMedia{
    protected String name;
    protected String likes;

    FaceBook(){

    }
    FaceBook(String title,String name, String likes){
        this.title = title;
        this.name = name;
        this.likes = likes;
    }
  
    public void setName(String name){
        this.name = name;
    }

    public void setLikes(String likes){
        this.likes = likes;
    } 

    public void setTitle(String title){
        this.title = title;
    } 

    String getTitle(){
        return title;
    }

    String getName(){
        return name;
    } 

    String getLikes(){
        return likes;
    } 

    public void display(){ //override  
        System.out.println("The Title of Facebook: " + title + "\nThe name of Facebook:" +  name + "\nThe Likes on FaceBook : " + likes  );

} 
}


//Create public Main class of aur program
public class Driver{

    public static void main(String args[]){
        Media[] arr = new PrintMedia[5];
        arr[0] = new Book("mohsinDon","mohsin", "fantacy");
        arr[0].display();

        Book b = new Book("Mohsin Javed", "Mohsin", "123");
        b.display();
    }
    
}