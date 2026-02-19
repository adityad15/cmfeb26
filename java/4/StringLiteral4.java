import java.util.Scanner;

class StringLiteral4{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		String s1 = "java";
		String s2 = "java";
		String s3 = "java";
		
		System.out.println((s1 == s2) && (s2 == s3));

	}
}