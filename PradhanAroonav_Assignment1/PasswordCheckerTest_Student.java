import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * STUDENT tests for the methods of PasswordChecker
 * @author Aroonav Pradhan
 *
 */
public class PasswordCheckerTest_Student {
ArrayList<String> passwords;
String password1, password2;
private Scanner scan;

	@Before
	public void setUp() throws Exception {
		String[] p = {"Adfdtolife14!", "aroonav14","aru14", "northPoint0809", "arooonav07", "HOWDYFOLKS23", "northest8", "realMadrid"};
		passwords = new ArrayList<String>();
		passwords.addAll(Arrays.asList(p));
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
		try {
			assertTrue(PasswordCheckerUtility.isValidPassword("Adfdtolife14!"));
			PasswordCheckerUtility.isValidPassword("aru14");
			assertTrue("LengthException not thrown", false);
					
		}
		catch(LengthException e)
		{
			assertTrue("LengthException successful", true);
			
		}
		catch(Exception e)
		{
			assertTrue("Threw other exception and not LengthException",false);
			
		}
	}
	
	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a NoUpperAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha()
	{
		try {
			assertTrue(PasswordCheckerUtility.isValidPassword("Adfdtolife14!"));
			PasswordCheckerUtility.isValidPassword("aroonav14");
			assertTrue("NoUpperAlphaException was thrown", false);
			
		}
		catch(NoUpperAlphaException e)
		{
			assertTrue("NoUpperAlphaException Successful", true);
			
		}
		catch(Exception e)
		{
			assertTrue("Threw other exception and not NoUpperAlphaException", false);
			
		}
	}
	
	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a NoLowerAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha()
	{
		try{
			assertTrue(PasswordCheckerUtility.isValidPassword("Adfdtolife14!"));
			PasswordCheckerUtility.isValidPassword("HOWDYFOLKS23");
			assertTrue("NoLowerAlphaException not thrown",false);
		}
		catch(NoLowerAlphaException e)
		{
			assertTrue("NoLowerAlphaExcepetion successful",true);
		}
		catch(Exception e)
		{
			assertTrue("Threw other exception and not NoLowerAlphaException",false);
		}
	}
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsWeakPassword()
	{
		try{
			assertTrue(PasswordCheckerUtility.isWeakPassword("northest8"));
			assertFalse(PasswordCheckerUtility.isWeakPassword("Adfdtolife14!"));
		}
		catch(Exception e)
		{
			assertTrue("Threw other exception and not NoLowerAlphaException",false);
		}
	}
	
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence()
	{
		try{
			assertTrue(PasswordCheckerUtility.isValidPassword("Adfdtolife14!"));
			PasswordCheckerUtility.isValidPassword("Arooonav07");
			assertTrue("InvalidSequenceException not thrown",false);
		}
		catch(InvalidSequenceException e)
		{
			assertTrue("InvalidSequenceException successful",true);
		}
		catch(Exception e)
		{
			assertTrue("Threw some other exception besides InvalidSequenceException",false);
		}
	}
	
	/**
	 * Test if the password has at least one digit
	 * One test should throw a NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit()
	{
		try {
			assertTrue(PasswordCheckerUtility.isValidPassword("Adfdtolife14!"));
			PasswordCheckerUtility.isValidPassword("realMadrid");
			assertTrue("NoDigitException not thrown",false);
		}
		catch(NoDigitException e)
		{
			assertTrue("NoDigitException successful",true);
		}
		catch(Exception e)
		{
			assertTrue("Threw some other exception and not NoDigitException",false);
		}
	}
	
	/**
	 * Test correct passwords
	 * This test should not throw an exception
	 */
	@Test
	public void testIsValidPasswordSuccessful()
	{
		try{
			assertTrue(PasswordCheckerUtility.isValidPassword("Adfdtolife14!")); //valid password
			PasswordCheckerUtility.isValidPassword("aru14"); //invalid password
			assertTrue("No Exception thrown",false);
		}
		catch(Exception e)
		{
			assertTrue("Exception thrown",true);
		}
	}
	
	/**
	 * Test the invalidPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testinvalidPasswords() throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, InvalidSequenceException {
		ArrayList<String> results;
		results = PasswordCheckerUtility.getInvalidPasswords(passwords);
		scan = new Scanner(results.get(0));
		assertEquals(scan.next(), "aru14");
	}
		
}
