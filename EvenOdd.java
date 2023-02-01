import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{ 
      Scanner reader = new Scanner(System.in);                       // Scanner class object created
      
      System.out.println(" Enter a Number :");                      //  Take input from user
      
      int num = reader.nextInt();                                 // Scan the next token of the input data as an "integer" data type                           
     
      if( num % 2 == 0)                                           //  if else loop use
      {
    	  System.out.println(num +" Is Even Number");             //  if number is %2==0 then print Even no
      }
      else
      {
    	  System.out.println(num +" Is Odd Number");             // if number is not %2==0 then print odd no
      }
	
	}
}