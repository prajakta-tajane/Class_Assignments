import java.util.Scanner;

public class ThreadEx 
{

	public static void main(String[] args)                                      // Main thread 
	{
		MyThread t = new MyThread();                                           // Create a MyThread object
		
		t.start();                                                            // call the start()
		
			System.out.println("Main Thread Excutes Successfully");	
	}
}
		 
class MyThread extends Thread                                               // create thread using extends 
		{
			public void run()                                               // Overriding the run() method
			{
			
		        int n1,n2,n3;                                               // create integer data type object
				Scanner sc = new Scanner(System.in);                        // Create scanner class object

				System.out.println(" Enter the two numbers");               // Take input from user 
				
				n1 = sc.nextInt();                                         // Scan the next token of the input data as an "integer" data type 
				n2 = sc.nextInt();                                         
				n3 =n1+n2;                                                 //  Perform the given operation and stored in to third object
	
	System.out.println("TOtal ="+n3);                                      // Print the result
}
}