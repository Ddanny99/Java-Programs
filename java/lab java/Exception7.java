class MyException extends Exception
{
	MyException(String s)
	{
		super(s); 
	}
}
class Exception7 
{
	static void check(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Note Valid To Vote");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String args[])
	{
		try
		{
			check(12);
		}
		catch(Exception e)
		{
			System.out.print("Exception Occured" +e);
		}
	}
}