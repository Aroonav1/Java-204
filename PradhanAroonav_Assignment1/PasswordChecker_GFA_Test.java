import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Test the methods of PasswordChecker
 * @author Professor Kartchner
 *
 */
public class PasswordChecker_GFA_Test {
	ArrayList<String> passwords;
	String password1, password2;

	@Before
	public void setUp() throws Exception {
		String[] p = {"334455BB", "Im2cool4U", "george2ZZZ", "4sale", "bertha22", "4wardMarch", 
				"august30", "abcdef", "Applesxx", "aa11b", "pilotProject", "myPassword", 
				"myPassword2"};
		passwords = new ArrayList<String>();
		passwords.addAll(Arrays.asList(p)); // puts strings into the ArrayList
		
		
		/* ************* STUDENT  ***************
		   Create another Arraylist of String to
		   use for the testValidPasswordsSTUDENT test
		*/
	}

	@After
	public void tearDown() throws Exception {
		passwords = null;
	}

	/**
	 * Test if the password is less than 8 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort()
	{
		try{
			//for all test password, check if they are valid
			//logic if the password is <8 characters long, then throw the length exception?
			assertTrue(PasswordCheckerUtility.isValidPassword("abcABC12"));
			PasswordCheckerUtility.isValidPassword("abc12");
			assertTrue("Did not throw lengthException",false);
			
		}
		catch(LengthException e)
		{
			//felixyu00 - throw lengthException? or log it?
			assertTrue("Successfully threw a lengthExcepetion",true);
		}
		catch(Exception e)
		{
			assertTrue("Threw some other exception besides lengthException",false);
		}
	}
	
	/**
	 * Test if the password is valid 
	 */
	@Test
	public void testIsValidPassword()
	{
		try{
			assertEquals(true,PasswordCheckerUtility.isValidPassword("strongPWD1"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			assertTrue("Threw some incorrect exception",false);
		}
	}
}