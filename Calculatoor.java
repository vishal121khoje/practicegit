package ExceptionHandlingAssignment;

import java.util.Scanner;

class Calculatoor
{
 long power(int n, int p) 
{
	long result=0;
try
{
if( n<0 || p<0)      	   throw new Exception("n or p should not be negative") ;
else if( n==0 || p==0) 	   throw new Exception("n or p should not zero") ;
else                        result= (long)Math.pow(n,p);


}
catch(Exception r){System.out.println(r.getMessage());}

return result;

}

public static void main(String a[])
{
	Calculatoor m= new Calculatoor();
	Scanner s= new Scanner(System.in);
	int x= s.nextInt();
	int y=s.nextInt();
System.out.println(m.power(x,y));
}}
