import java.util.Scanner;

class Pattern7{

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		int digit = 1;
		int size = sc.nextInt();
		
		for(int i = 1 ; i <= size ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print(digit+++" ");
			}
		System.out.println();
		}
	sc.close();
	}
}