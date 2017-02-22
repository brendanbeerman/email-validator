package brendan.Email_Validator;

public class Validator
{
	private String emailAddress;
	private boolean isValidEmail;
	
	public Validator(String emailAddress)
	{
		this.emailAddress = emailAddress;
		
		isValidEmail = validateDriver();
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public boolean getIsValidEmail()
	{
		return isValidEmail;
	}
	
	private boolean validateDriver()
	{
		return onlyOneAtSymbol() && atLeastOnePeriod();
	}
	
	private boolean onlyOneAtSymbol()
	{
    	int atCount = 0;
    	
    	for (int i = 0; i < emailAddress.length(); i++)
    	{
    		if (emailAddress.charAt(i) == '@')
    			atCount++;
    	}
    	
    	if (atCount == 1)
    		return true;
    	else
    		return false;
	}
	
	private boolean atLeastOnePeriod()
	{
		for (int i = 0; i < emailAddress.length(); i++)
		{
			if (emailAddress.charAt(i) == '.')
				return true;
		}
		
		return false;
	}
}
