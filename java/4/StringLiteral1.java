import java.util.Scanner;

class StringLiteral1{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		String s1 = new String("he123llo");
		String s2 = new String("he123llo");

		System.out.println(s1 == s2); //checks object reference
		System.out.println(s1.equals(s2)); //checks value
		
	sc.close();
	}
}