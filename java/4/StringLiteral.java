import java.util.Scanner;

class StringLiteral{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		String s1 = "he123llo";
		String s2 = "he123llo";

		System.out.println("Both variables point to the same object: " +(s1 == s2));
		
	sc.close();
	}
}