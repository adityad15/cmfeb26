import java.util.Scanner;

class VowelCount {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;

		for(int i =  0 ; i <= s.length()-1 ; i++){
			switch (s.toLowerCase().charAt(i)){
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				default:
					break;
			}
		}
		sc.close();
		System.out.println(count);
	}
}