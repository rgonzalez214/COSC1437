//Rolando Gonzalez 05/01/17
//COSC-1437-83428
//this class contains the bools to test the users inputs.

public class PasswordVerifier{
    
    //declar variables
    private static int MIN_PASSWORD_LENGTH = 6;    
    private static boolean isValid;
    public static boolean isValid(String str)
    {
        // Is the string the correct length? 
        if (str.length() >= MIN_PASSWORD_LENGTH && hasUpperCase(str) && hasDigit(str)){
            isValid = true;
        }
        else
        {
            isValid = false;
        }
        return isValid;
    }
    
    //bool to check upper case character
    private static boolean hasUpperCase(String str)
    {
        boolean isValid = false;
        int i = 0; 
        
        //test if it has an upper case, if not move on to next character.
        while(i < str.length()){
            if (Character.isUpperCase(str.charAt(i))){ 
                isValid = true;
                break;
            }
            i++;
        }
        return isValid;
    }
    //bool to check lower case
    private static boolean hasLowerCase(String str)
    {
        boolean isValid = false;
        int i = 0;
        
          //test if it has a lower case, if not move on to next character.
        while(i < str.length()){
            if (Character.isLowerCase(str.charAt(i))){
                isValid = true;
                break;
            }
            i++;
        }
        return isValid;
    }
    
    //bool to check for digits
    private static boolean hasDigit( String str)
    {
        
        boolean isValid = false;
        int i = 0; 
        
        //test if it has a digit, if not move on to next character.
        while(i < str.length()){
            
            if (Character.isDigit(str.charAt(i)))
            {
                isValid = true;
            }
            i++;
        }
        return isValid;
    }
}