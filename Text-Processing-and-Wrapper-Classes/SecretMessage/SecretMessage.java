// Rolando Gonzalez
// COSC 1437
//program to decode the secret message from the input file.

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class SecretMessage {
    
    public static void main(String[] args) throws IOException {
        
        String line;
       String words;
        int count = 0;
        char letter;
        
        StringBuilder str = new StringBuilder();
        
        // Open the file.
        File file = new File("secret.txt");
        Scanner inputFile = new Scanner(file);
       line = inputFile.nextLine();
        
       StringTokenizer tokens = new StringTokenizer(line.trim(), " ");
       
      
        
    
      while (tokens.hasMoreTokens())
      {
          //  set the wordToken String object = the next token (word) of the tokenizer object
          words = tokens.nextToken();
         
         //  if the number (count) of the current word can be divided by 5 with a remainder of 0 (words numbered from 0)
          if(count%5==0){
               //    then that word's first character is part of the secret message so:
              //    - save the first character of that word to the local variable letter
              //    - turn this chararacter to upper case using the appropriate method of the Character wrapper class
              letter = Character.toUpperCase(words.charAt(0));
         
            //    - append the character to the local variable str which holds the secret message
             str.append(letter);
          }
          
         //  increment the counter by 1
          count++;
      }
      
      System.out.println(str);
   } //end main method
} //end class
          
          