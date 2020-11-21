class Exception1
{
	public static void main(String args[])
	{
		int x=50,y=0;
		int result=0;
		try
		{
			result = x/y; //Arithmetic exception
			
			System.out.println("We are in try block");
		}
		cathch(ArithmeticException e)//catching ArithmeticException
		{
			System.out.println("ArithmeticException occured");
			System.out.println(e);
		}
	}
}