interface printable
{
	void print();
}
class A implements printable
{
	public void print()
		{
			System.out.println("hello");
		}
	public static void main(String args[])
		{
			A obj= new A();
			obj.print();
		}
}