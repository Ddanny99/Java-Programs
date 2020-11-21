class Exception5
{
	static void check(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Note Valid To Vote");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String args[])
	{
		check(12);
		System.out.print("End of Program");
	}
}