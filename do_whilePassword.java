import java.util.*;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
 
public class do_whilePassword
{
 	public static void main(String[] args)
	{      
		int count=0;
		String passWord = "Easy";
		int i=0;
		String inputPass="";
		String password;
		String upperCaseChars = "(.*[A-Z].*)";
		String lowerCaseChars = "(.*[a-z].*)";
		String numbers = "(.*[0-9].*)";
		boolean valid = true;
		do {
			inputPass=JOptionPane.showInputDialog(" Enter password");
			if(inputPass.equals(passWord)){
				System.out.println("correct password");
			}
			if(!(inputPass.equals(passWord))){ 
				System.out.println("Incorrect password . Please Enter password");
			}
			count++;
		}while(!inputPass.equals(passWord) && count<3);  
		        
		if((inputPass.equals(passWord))== !valid){ 
				System.out.println("The password was Easy.Please set a new user password");
				password=JOptionPane.showInputDialog(" new correct password:");
		      
			if((password.length()<21)==false || (password.length()>0)==false) //– The password may have any number of characters between 1 and 20, inclusive.
			{
				System.out.println(" password length is not correct ");
				valid=false;
			}
	       
			else if((password.charAt(0) == '_')==false || (password.substring(0,1).equalsIgnoreCase("true"))==false)//– The password may start with an underscore "_" or any letter of the alphabet.
			{
				System.out.println(" password starts with underscore or any case alphabet.");
				valid=false;
			}
	 
			else  if ((password.matches(upperCaseChars ))==false || (password.matches(lowerCaseChars)  )==false)
			//– The password may be any combination of upper and lower case letters.
			{
				System.out.println("Password should contain a combination of upper case alphabets or lowercase alphabets");
				valid=false;                 
			}
		        
			else if ((password.matches(numbers ))==false && (password.matches("[a-z A-Z]"))==false && (password.matches ("[_]" ))==false)
			//– The password consists only of numbers, English alphabet letters, and the underscore character.
			{
				System.out.println(
				" password should consist only of numbers, English alphabet letters, and the underscore character.");
				valid=false;         
			}
		         
			while(valid==true) {
				System.out.println("Password changed");
			}
		}      
         
	}
}
