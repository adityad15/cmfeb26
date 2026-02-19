import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i*2; j+=2) {
                if (j != 1) { 
                    System.out.print("*");
                }
                System.out.print(j);            
            }
            System.out.println();
        }
    sc.close();
    }
}