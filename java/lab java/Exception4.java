import java.io.*;
class Exception4
{
	public static void main(String args[])
	{
		try
		{
			FileReader file = new FileReader("Somefile.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Catch Block.");
		}
	}
}