import java.util.Scanner;

class StringLiteral3{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		String s1 = new String("hello");
		String s2 = s1.intern();
		String s3 = "hello";

		System.out.println(s2 == s3);

	}
}