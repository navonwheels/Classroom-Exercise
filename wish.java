class wish
{
	static
	{
		System.out.println("STATIC BLOCK");
	}
	wish()
	{
		System.out.println("constructor");
	}
	public static void display()
	{
		System.out.println("METHOD/NON-STATIC/INSTANCE");
	}
	public static void main(String[]ar) 
	{
		System.out.println("Static method");
		new wish();
		wish.display();
	}
}