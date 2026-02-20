import java.util.Scanner;

class Pattern9{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();

		for(int i = 0 ; i < size ; i++){
			for(int j = 0 ; j < size-i ; j++){
				System.out.print(" ");
			}
			for(int j = 0 ; j <= 2*i ; j++){
				System.out.print("*");
			}
		System.out.println();			
		}

		for(int i = size ; i >= 0 ; i--){
			for(int j = 0 ; j < size-i ; j++){
				System.out.print(" ");
			}
			for(int j = 0 ; j <= 2*i ; j++){
				System.out.print("*");
			}
		System.out.println();			
		}
	}
}