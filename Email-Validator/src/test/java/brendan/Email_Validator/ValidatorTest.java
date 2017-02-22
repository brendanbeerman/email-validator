package brendan.Email_Validator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTest
{
	@Test
    public void validEmail()
	{
		String [] testEmails = new String[]{"hello", "something@gmail.com", "......@@@@", "in_vali+d.e~mail@hotmail.com", " ", "lengthbreaker@.lengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreakerlengthbreaker"};
		boolean [] validity = new boolean[]{false, true, false, false, false, false};
		
		Validator validator;
		
		for (int i = 0; i < testEmails.length; i++)
		{
			validator = new Validator(testEmails[i]);
			
			assertEquals(validator.getIsValidEmail(), validity[i]);
		}
	}
}
