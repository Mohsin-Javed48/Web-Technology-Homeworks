import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import javax.swing.*;
import java.io.*;

class ReadFile implements Runnable{ 
      String fileName; 
       
      // param constructor  
public ReadFile(String fn) 
{  
fileName = fn;  
} 
 
// overriding run method 
// this method contains the code for file reading  
// Read and print data line by line with the fileName 
public void run ( ) 
{ 
	try
	{
		   FileReader fr = new FileReader(fileName);
           BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line != null){
			System.out.println( fileName + line);
			line = br.readLine();
		}
		fr.close();
		br.close();
 	
 	
 	}
	catch(IOException e)
	{
 	System.out.println(e);
	}
	
		
		
}



} // end of class 
 
    
 
public class Driver{  
public static void main (String args[]) 
{ 
	final String fileName1 = "File1.txt";
	final String fileName2 = "File2.txt";
	
 
// create ReadFile objects by passing file names to them 
	ReadFile rf1 = new ReadFile(fileName1);
	ReadFile rf2 = new ReadFile(fileName2);
	
// create and start multiple threads (at least two) 
   
		Thread file1 = new Thread(rf1);
		Thread file2 = new Thread(rf2);
	


        file1.start();
		file2.start();
        try {
            file1.join(); // Wait for reader thread to finish reading numbers
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            file2.join(); // Wait for calculator thread to finish calculating sum
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
 
   }
}