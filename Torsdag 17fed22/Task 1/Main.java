public class Main
{
	// Body
	public static void main(String[]args) 
	{
		//1.b	
		System.out.println(" ");
		//1.c
		print("blabla");
		//1.d
		nameAge("Mark","99");					
	}

	// Funktioner kommer efter og kaldes i body
	public static void print(String s) 
	{
		
		System.out.println(s);
	}

	public static void nameAge(String name, String age) 
	{
		System.out.println("my name is " + name + ", and im" + age + "years old");

	}
}