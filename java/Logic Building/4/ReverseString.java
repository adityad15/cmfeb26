import java.util.Scanner;

class ReverseString{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev_s = "";

		for(int i = s.length()-1 ; i >= 0 ; i--){
			rev_s+=s.charAt(i);
		}
		sc.close();
		System.out.println(rev_s);
	}
}