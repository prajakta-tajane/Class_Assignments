import java.util.Scanner;

public class MultiplicationOverloadingEx 
{
	public void mul(double p,double q)                                         // create method multiplication and pass "double" data type with two argument
	
{	
		double r =p*q;                                                        // perform the multiplication operation when the values are two in the form of double data type
	System.out.println(" Multiplication of two double numbers :" +r);        // Display the result  
	
}
	
public void mul(double p,double q,double n)                                 // create method multiplication and pass "double" data type with three argument
{
	double u = p*q*n;
	System.out.println(" Multiplication of three double numbers :"+u);
	
}


public void mul(int a,int b)                                                 // create method multiplication and pass "integer" data type with two value
{	
	int s =a*b;                                                             // perform the multiplication operation when the values are two in the form of integer data type
	System.out.println("Multiplication of two integer numbers :" +s);       // Display the result
}
public void mul(int a,int b,int c)                                          // create method multiplication and pass "integer" data type with two value
{
	int t = a*b*c;
	System.out.println("Multiplication of three integer numbers :" +t);
}

public static void main(String[] args)                                           // Main method
 {
	
	MultiplicationOverloadingEx  N = new MultiplicationOverloadingEx ();                 // create the object of class
	N.mul(1.5,8.5,9.4);                                                                  // pass the argument or values
			
 }
}	
