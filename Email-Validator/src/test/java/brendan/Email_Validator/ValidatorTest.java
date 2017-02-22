package brendan.Email_Validator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTest
{
	@Test
    public void validEmail()
	{
		String [] testEmails = new String[]{"hello", "something@gmail.com", "......@@@@", "valid.email@hotmail.com"};
		boolean [] validity = new boolean[]{false, true, false, true};
		
		Validator validator;
		
		for (int i = 0; i < testEmails.length; i++)
		{
			validator = new Validator(testEmails[i]);
			
			assertEquals(validator.getIsValidEmail(), validity[i]);
		}
	}
}
