package EnumExample;

/**
 * Create class enumExample3EnumTest.java which implements comparison methods using equals (==) and using switch case.
 */

public class enumExample3Test 
{

	public static void main(String[] args) 
	{
 
		// Let's check eNum using Switch-Case statement
		log("Comparison using Switch-Case ========================");
		enumExample3TestSwitch(enumExample3.FACEBOOK);
		enumExample3TestSwitch(enumExample3.TWITTER);
 
		// Let's check eNum using Equal (==) operator
		log("\nComparison using == operator ========================");
		enumExample3TestEqualSign(enumExample3.CRUNCHIFY);
		enumExample3TestEqualSign(enumExample3.YAHOO);
 
		// Let's check eNum using .equals() method
		log("\nComparison using .equals() ========================");
		enumExample3TestEqualsMethod(enumExample3.FACEBOOK);
		enumExample3TestEqualsMethod(enumExample3.GOOGLE);
	}
 
	private static void log(String str) 
	{
		System.out.println(str);
	}
 
	// Method-1: Using Switch-Case
	private static void enumExample3TestSwitch(enumExample3 company) 
	{
 
		// NOTE: we haven't added switch case for TWITTER intentionally here
		
		switch (company) 
		{
		case GOOGLE:
			log("Enum check PASSED for: GOOGLE");
			break;
		case FACEBOOK:
			log("Enum check PASSED for: FACEBOOK");
			break;
		case YAHOO:
			log("Enum check PASSED for: YAHOO");
			break;
		case CRUNCHIFY:
			log("Enum check PASSED for: CRUNCHIFY");
			break;
		default:
			log("Enum check FAILED for company: " + company);
			break;
		}
 
	}
 
	// Method-2: Using == Operator
	private static void enumExample3TestEqualSign(enumExample3 company) 
	{
 
		// NOTE: we haven't added switch case for GOOGLE intentionally here
		
		if (company == enumExample3.FACEBOOK) 
		{
			log("Enum check PASSED for: FACEBOOK");
		} 
		else if (company == enumExample3.TWITTER) 
		{
			log("Enum check PASSED for: TWITTER");
		} 
		else if (company == enumExample3.YAHOO) 
		{
			log("Enum check PASSED for: YAHOO");
		} 
		else if (company == enumExample3.CRUNCHIFY) 
		{
			log("Enum check PASSED for: CRUNCHIFY");
		} 
		else 
		{
			log("Enum check FAILED for company: " + company);
		}
	}
	
	// Method-3: Using equals()
	private static void enumExample3TestEqualsMethod(enumExample3 company) 
	{
		if (company.equals(enumExample3.FACEBOOK)) 
		{
			log("Enum check PASSED for: FACEBOOK");
		} 
		else 
		{
			log("Enum check FAILED for company: " + company);
 
		}
	}
 
}