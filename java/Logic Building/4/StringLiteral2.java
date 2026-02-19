import java.util.Scanner;

class StringLiteral2{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1+s2;

		System.out.println(s3);
		System.out.println(s3 == s1);

		sc.close();
		
	}
}