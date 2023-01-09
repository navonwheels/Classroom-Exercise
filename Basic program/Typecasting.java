

public class Typecasting{
	
	public static void main(String[]ar) {
		
		char letter = 'a' ;


		int ascii = letter - 32;


		System.out.println("ASCII value of = " + letter + " is : "+ ascii);


		char ex = (char)ascii;


		System.out.println("from ASCII value to = " + ascii + " letter is: " +ex);
		
		
	}
}