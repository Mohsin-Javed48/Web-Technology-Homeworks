import javax.swing.*;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.*;

class PersonInfo{
    String name;
    String address;
    String phoneNum;

    //parameterized constructor
    public PersonInfo(String name,String address,String phoneNum){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    //Method to display person record on GUI

    public void print(){
        JOptionPane.showMessageDialog(null, "Name: " + name +
         "Address: " + address + "Phone Number: " + phoneNum);
    }
    //end of class
}


class AddressBook{
    ArrayList persons;

    //constructor
    public AddressBook(){
        persons = new ArrayList();
    }

    //add nre person record in arraylist after taking input
    public void addPerson(){
        String name = JOptionPane.showInputDialog("Enter Name: ");
        String address = JOptionPane.showInputDialog("Enter Address: ");
        String phoneNum = JOptionPane.showInputDialog("Enter Phone Number: ");
        //construct new person object
        PersonInfo p = new PersonInfo(name,address,phoneNum);
        //add the above personinfo object in arraylist
        persons.add(p);
    }
    //search perons record by name by iterating over arrayList 
    public void searchPerson(String n) {
        for(int i = 0; i< persons.size(); i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(n.equals(p.name)){
            p.print();
            }
        }
    }//end search person

    //delete person record by name by iterating over arrayList
    public void deletePerson (String n){
        for(int i = 0; i<persons.size(); i++){
            PersonInfo p = (PersonInfo) persons.get(i);
            if(n.equals(p.name)){
                persons.remove(i);
            }//end of delete person
        }//end class
    }

    // public void loadPersons(){
    //     String tokens[] = null;
    //     String name, address,phoneNum;
    //     try{
    //         FileReader fr = new FileReader("person.txt");
    //         BufferedReader br = new BufferedReader(fr);
    //         String line = br.readLine();
    //         while (line!= null) {
    //             tokens = line.split(",");
    //             name = tokens[0];
    //             address = tokens[1];
    //             phoneNum = tokens[2];
    //             PersonInfo p = new PersonInfo(name, address, phoneNum);
    //             persons.add(p);
    //             line = br.readLine();
    //         }
    //         br.close();
    //         fr.close();

    //     }catch(IOException ioEx){System.out.println(ioEx);}
    // }

    public void loadPersons(){
        String tokens[] = null;
        String name,adress,phoneNum;

        try{
            FileInputStream fis = new FileInputStream("person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            
            while (true) {
                try{
                PersonInfo p = (PersonInfo)ois.readObject();
                persons.add(p);

                }catch(EOFException e){
                    break;
                }
            }

            fis.close();
            ois.close();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
            System.out.println(ioEx);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }

    // public void savePersons(){
    //     try{
    //         PersonInfo p;
    //         String line;
    //         FileWriter fw = new FileWriter("person.txt");
    //         PrintWriter pw = new PrintWriter(fw);
    //             for(int i=0; i<persons.size(); i++){
    //                 p = (PersonInfo) persons.get(i);
    //                 line = p.name + "," + p.address + "," + p.phoneNum;
    //                 //writes line to file (persons.txt)
    //                 pw.println(line);
    //             }
    //             pw.flush();
    //             pw.close();
    //             fw.close();
    //     }catch(IOException ioEx) {System.out.println(ioEx);}
    // }

    public void savePersons(){
   

        try{
            FileOutputStream fos = new FileOutputStream("person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            
            while (true) {
                try{    
                    for (int i =0; i< persons.size() ; i++) {
                        oos.writeObject(persons.get(i));
                    }     
                     
                }catch(EOFException e){
                    break;
                }
            }
            
            fos.close();
            oos.close();
        }catch(IOException ioEx){
            ioEx.printStackTrace();
            System.out.println(ioEx);
        } 
}
}


public class Test{
    public static void main(String args[]){
        AddressBook ab = new AddressBook();
        String input,s;
        int ch;
        while(true){
            input = JOptionPane.showInputDialog("Enter 1 to add " + "\n Enter 2 to Search " + "\nEnter 3 to Delete " + "\nEnter 4 to Exit");
            ch = Integer.parseInt(input);
            
            ab.loadPersons();
            switch (ch) {
            case 1:
            ab.addPerson();
                break;
            case 2:
            s = JOptionPane.showInputDialog("Enter the name to search: ");
            ab.searchPerson(s);
                break;
            case 3:
            s = JOptionPane.showInputDialog("Enter the name to search: ");
            ab.deletePerson(s);
                break;
            case 4:
            System.exit(0);
            ab.savePersons();

            } 

            
        }
    }
}

