package ExceptionHandlingAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
  Take two integers and as input, you have to compute x/y . If x and
  y are not integers or if is zero , exception will occur and you have to
  report it. Read sample Input/Output to know what to report in case of
  exceptions.
 */
public class Ass_Q1 {

	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		try
		{   
			System.out.println("Enter the value of x");
			int x=s.nextInt();
			
			System.out.println("Enter the value of y");
		    int y= s.nextInt();
		    
		    int z= x/y;
		    System.out.println(" z="+ z);
		
		}
		catch(ArithmeticException a1)
		{
			System.out.println("number cannot be divided by zero ");
			System.out.println(a1.getMessage());
		}
		catch(InputMismatchException mi)
		{
			System.out.println("plz enter integer only");
		}
		
		System.out.println("end ");

	}

}

