import java.util.ArrayList;

/**
 * Assignment 1 implementation
 * @author aroonav
 *
 */
public class PasswordCheckerUtility {
	
	private String passwordString;
	

	//constructor
	public PasswordCheckerUtility() throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, InvalidSequenceException {
		setPassword(passwordString);
		isValidPassword(passwordString);
	    isWeakPassword(passwordString);
		
	}
	
	
	public void setPassword(String passwordString){
		
		this.passwordString = passwordString;
	}
	
	
	public static boolean isValidPassword(String passwordString) throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, InvalidSequenceException {
		
		boolean hasUppercase = !passwordString.equals(passwordString.toLowerCase());
		boolean hasLowercase = !passwordString.equals(passwordString.toUpperCase());
		
		//if password is valid, return true
		
		
		if (passwordString.length() >= 6){
			
			if (hasUppercase) {
				
				if (hasLowercase) {
		
					if (passwordString.matches("(?=.*[0-9]).*")) {
						
						for (int i = 0; i < (passwordString.length()-1); i++) {
							if(passwordString.charAt(i)==passwordString.charAt(i+1)) {
								if(Character.isUpperCase(passwordString.charAt(i)) == Character.isUpperCase(passwordString.charAt(i+1))){
									throw new InvalidSequenceException("This password has an invalid sequence with more than two repeating characters.");
								}
							}
							
						}		
						return true;	
					}
					else {
						throw new NoDigitException("This password must contain at least one digit.");
					}
				}
				else {
					throw new NoLowerAlphaException("This password must contain at least one lower case chatacter.");
				}
			}
			else {
				throw new NoUpperAlphaException("This password must contain at least one upper case character.");
			}
		}
		else {
			throw new LengthException("The password must contain at least 6 characters long.");
		}
	}
		
	
	// check whether a password is weak
	public static boolean isWeakPassword(String passwordString) {
		
		if(passwordString.length() >= 10) 
			return false;
		return true;
	}
	
	// returns list of invalid passwords
	public static ArrayList<String> invalidPasswords(ArrayList<String> passwords) {

		ArrayList<String> invalid_passwords = new ArrayList <String>(passwords.size());	
		for(int i = 0; i < passwords.size(); i++) {
			try {
				PasswordCheckerUtility.isValidPassword(passwords.get(i));
				}
			catch (LengthException | NoUpperAlphaException | NoLowerAlphaException | NoDigitException
					| InvalidSequenceException e) {
			invalid_passwords.add(passwords.get(i));
			}
		}
		return invalid_passwords;
		
	}


	public static ArrayList<String> getInvalidPasswords(ArrayList<String> passwords) {
		// TODO Auto-generated method stub
		return invalidPasswords(passwords);
	}
	
}
