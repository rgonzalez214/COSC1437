//Rolando Gonzalez 05/01/17
//COSC-1437-83428
//This program prompts the user to enter a password and checks if it meets criteria.

import java.util.Scanner;

public class PasswordDemo
{
    
    public static void main (String [] args)
    {
        //variables
        char inputChar;
        String str;
        
        //scanner for user input.
        Scanner keyboard = new Scanner(System.in);
        
        // prompt the user for the password.
        System.out.print("Enter a password: ");
        
        //insert user input into the str string.
        str = keyboard.nextLine();
        
        //test users input with the passwordverifier class
        if (PasswordVerifier.isValid(str))
        
        { 
            //if password meets criteria output approval.
            System.out.println("This password meets stated criteria.");
        }
        else
        {
            //if password does not meet criteria output disapproval.
            System.out.println("Current password does not meet criteria.");
        }
    }
}