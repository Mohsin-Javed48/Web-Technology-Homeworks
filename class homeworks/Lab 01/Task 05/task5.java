import java.lang.*;
import java.util.*;

class task5{
    static void armstrong(int start, int end)
    {
        int[] intArray = new int[10];
        int index= 0;
        int value = 0;
        int number =0;;
        for (int i = start; i<= end; i++) {
            number = i;
            // Convert the number to a string
            String numberString = Integer.toString(i);
            // System.out.println(numberString);
            
            // Iterate over each character of the string and print each digit
        for (int j = 0; j < numberString.length(); j++) {
            char digitChar = numberString.charAt(j); // Get the character at index i
            int digit = Character.getNumericValue(digitChar); // Convert the character to its numeric value
            value =value+ ( digit * digit * digit);
            
            // System.out.println("Digit at position " + (j + 1) + ": " + digit);
        }

        // System.out.println("value is "+value);
        // System.out.println("number  is "+number);
        if (value == number) {
            intArray[index++] = value;
            value = 0;
        }
        else{
            value = 0;
        }
    }

    if (intArray[0] == 0) {
        System.out.println(intArray[0]);     
    }
    for (int k = 0; k<10;k++) {
      
        if (intArray[k] != 0) {
            System.out.println(intArray[k]);   
        }
    }
    
        
    }
    public static void main(String args[])
    {
        armstrong(0, 1000);

    }
}