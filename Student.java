package ExceptionHandlingAssignment;

//Q 7 Write a program that define interface 
//Admission having abstract method registration 
//Create another class Student in separate 
//file having method Addstudent ()
//
//a)In Addstudent create local class Mtech student
//that inherits Admission interface 
//b)In same method  also create anonymous class that 
//also inherits Admission interface 
//In both above classes implement registration method 
//
//In main call AddStudent method of student class
interface admission
{
	void registration();
}
public class Student
{
	void addstudent()
	{
		class Mtech implements admission
		{
			@Override
			public void registration() 
			{
				System.out.println("Mtech Admission ");
				
				admission e = new admission() 
				{
					@Override
					public void registration() 
					{
						System.out.println("Mtech Admissin override in anonymous class");
					}
					
				};
				e.registration();
				System.out.println("Interface of Admission");
			}
		}
		Mtech m = new Mtech();
		m.registration();
	}
	
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.addstudent();
    }
}
	


