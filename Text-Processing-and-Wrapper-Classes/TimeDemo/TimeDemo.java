// Rolando Gonzalez
// COSC 1437
// Represents time in hours and minutes using 
// the customary conventions

import java.util.Scanner;

public class TimeDemo
{
	public static void main (String [] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		char answer = 'Y';
		String enteredTime;
		String response;
	
        
		while (answer == 'Y')//CHECK ANSWER AFTER CONVERTING TO CAPITAL
		{
			System.out.print(
				"Enter a military time using the ##:## form   ");
			enteredTime = keyboard.nextLine();
			Time now = new Time (enteredTime);
			System.out.println(
				"Do you want to enter another (Y/N)?  ");
			response = keyboard.nextLine();
            //converted to uppercase
			answer = Character.toUpperCase(response.charAt(0));
		}
		
	}
}