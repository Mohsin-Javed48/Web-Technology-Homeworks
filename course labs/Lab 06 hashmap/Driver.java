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


class Words{
	String word;
	String meaning;
	
	Words(String word, String meaning){
		this.word = word;
		this.meaning = meaning;
	}
	
	void setWords(String word){
		this.word = word;
	}
	void setMeaning(String meaning){
		this.meaning = meaning;
	}
	
	String getWord(){
		return word;
	}
	String getMeaning(){
		return meaning;
	}
}

class Dictionary{
	HashMap<String,String> map;
	
	Dictionary() {
		map = new HashMap<>();
	}
	
	public void insertRecord(){
		String word;
		String meaning;
		
		word = JOptionPane.showInputDialog("Enter the word");
		meaning = JOptionPane.showInputDialog("Enter meaning");
		
		Words w = new Words(word, meaning);
		
		map.put(w.word, w.meaning);
	}
	
	String find(String value){
		String meaning = map.get(value);
		String notFound = "not found";
		
		if(map.get(value) == null){
			return notFound;
		}else{
			return meaning ;
		}
		
		
	}
}

public class Driver{
		public static void main(String args[]){
			Dictionary d = new Dictionary();
			
			d.insertRecord();
			d.insertRecord();
			d.insertRecord();
			System.out.println(d.find("haider"));
		}
}