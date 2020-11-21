import java.io.*;
class Exc
{
	void method() throws IOException
	{
		throw new IOException("Device Error");
	}
}
class Exception6
{
	public static void main(String args[])
	{
		try
		{
			Exc obj = new Exc();
			obj.method();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("End of Program");
	}
}