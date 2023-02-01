
public class ExceptionHandlingEx 
{
public static void main(String[] args) 
	{
		 int i =100;                                           // create a object and assign the values
         int j =20; 
         int R =i/j;                                          // perform division operation
        
        System.out.println("Division of two Numbers");        // print the division of two numbers
      
		try
		{
			System.out.println(i/j);                         // print result of two numbers		
		}
		
      catch(ArithmeticException e)                          // catch the Arithmetic Exception
		{
      	System.out.println(e.getMessage());                // get the output
		}
	}

}