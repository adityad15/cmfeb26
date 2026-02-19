import java.util.Scanner;

class NOutputNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++){
			System.out.println(i);
		}
	}
}