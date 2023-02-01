import java.util.Scanner;

public class ThrowsExceptionEx {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);                          // create scanner class object
		
		System.out.println("Enter your age");                        // Take a input from user
		
		int age = sc.nextInt();                                    // Scan the next token of the input data as an "integer" data type
		
		if(age>=18)                                                // If else loop use 
		
		{
			System.out.println("Eligible for Votting");            // age >=18 then print Eligible for Votting
			 
		}
	
		else
	{
		System.out.println("Not Eligible for Votting");              // age <18 then print Not Eligible for Votting
		
	}
		
		try
		
		{
			System.out.println(age>=18);                                // print the result
		}
			
		catch(Exception e)
		
		{
			throw new ArithmeticException("Not Eligible for Voting");       // throws Exception
	    }
	}
	
}